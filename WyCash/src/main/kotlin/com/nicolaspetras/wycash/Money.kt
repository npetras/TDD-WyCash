package com.nicolaspetras.wycash

open class Money(val amount: Int, val currencyType: CurrencyType = CurrencyType.NONE): Expression {

    fun times(multiplier: Int): Money {
        return Money(this.amount * multiplier, currencyType)
    }

    fun plus(addend: Money): Expression {
        return Money(this.amount + addend.amount, currencyType)
    }

    override fun equals(other: Any?): Boolean {
        val otherMoney = other as Money
        return this.amount == otherMoney.amount &&  this.currencyType == otherMoney.currencyType
    }

    override fun hashCode(): Int {
        return amount
    }
}
