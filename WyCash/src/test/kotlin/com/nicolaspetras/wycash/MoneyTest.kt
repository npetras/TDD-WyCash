package com.nicolaspetras.wycash

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MoneyTest {
    @Test
    fun `test equality - two equal Money objects`() {
        val fiveMoneys1 = Money(amount = 5)
        val fiveMoneys2 = Money(amount = 5)

        assertTrue(fiveMoneys1 == fiveMoneys2)
    }

    @Test
    fun `test equality - two differing Money objects`() {
        val fiveMoneys = Money(amount = 5)
        val oneMoney = Money(amount = 1)

        assertTrue(fiveMoneys != oneMoney)
    }

    @Test
    fun `test equality - two different types of Money objects`() {
        val fiveFrancs = Money(amount = 5, currencyType = CurrencyType.CHF)
        val fiveDollars = Money(amount = 5, currencyType = CurrencyType.USD)

        assertFalse(fiveFrancs == fiveDollars)
    }

    @Test
    fun `test multiplication basic`() {
        val fiveMoney = Money(5)
        val product = fiveMoney.times(2)
        val expectedProduct = Money(10)
        assertEquals(expectedProduct, product)
    }

    @Test
    fun `test multiplication - method called twice` () {
        val fiveMoney = Money(5)
        val expectedProduct = Money(15)

        var product = fiveMoney.times(2)
        product = fiveMoney.times(3)

        assertEquals(expectedProduct, product)
    }

    @Test
    fun `test simple addition`() {
        val fiveDollars = createDollar(5)
        val bank = Bank()
        val sum = fiveDollars.plus(fiveDollars)
        val reducedSum = bank.reduce(sum, CurrencyType.USD)

        assertEquals(createDollar(10), reducedSum)
    }

    @Test
    fun `test addition - plus() should return a Sum (Expression)`() {
        val fiveDollars = createDollar(5)
        val additionResult = fiveDollars.plus(fiveDollars)
    }
}

