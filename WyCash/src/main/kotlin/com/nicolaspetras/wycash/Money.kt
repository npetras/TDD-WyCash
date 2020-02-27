package com.nicolaspetras.wycash

open class Money(val amount: Int, val currencyType: CurrencyType = CurrencyType.NONE) {

    fun times(multiplier: Int): Money {
        return Money(this.amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        val otherMoney = other as Money
        return this.amount == otherMoney.amount &&  this.currencyType == otherMoney.currencyType
    }

    override fun hashCode(): Int {
        return amount
    }
}
