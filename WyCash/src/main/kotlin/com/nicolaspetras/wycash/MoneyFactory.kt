package com.nicolaspetras.wycash

fun createDollar(amount: Int): Money {
    return Money(amount = amount, currencyType = CurrencyType.USD)
}

fun createFranc(amount: Int): Money {
    return Money(amount = amount, currencyType = CurrencyType.CHF)
}

