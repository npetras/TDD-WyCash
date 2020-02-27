package com.nicolaspetras.wycash

class MoneyFactory {
    fun createDollar(amount: Int): Money {
        return Money(amount = amount, currencyType = CurrencyType.USD)
    }

    fun createFranc(amount: Int): Money {
        return Money(amount = amount, currencyType = CurrencyType.CHF)
    }
}
