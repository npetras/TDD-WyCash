package com.nicolaspetras.wycash

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class DollarTest {
    @Test
    fun `test multiplication basic`() {
        val fiveDollars = Dollar(5)
        val product = fiveDollars.times(2)
        val expectedProduct = Dollar(10)
        assertEquals(expectedProduct, product)
    }

    @Test
    fun `test multiplication - method called twice` () {
        val fiveDollars = Dollar(5)
        val expectedProduct = Dollar(15)

        var product = fiveDollars.times(2)
        product = fiveDollars.times(3)

        assertEquals(expectedProduct, product)
    }

    @Test
    fun `test equality - two equal Dollars`() {
        val fiveDollars1 = Dollar(5)
        val fiveDollars2 = Dollar(5)

        assertTrue(fiveDollars1 == fiveDollars2)
    }

    @Test
    fun `test equality - two differing Dollars`() {
        val fiveDollars = Dollar(5)
        val oneDollar = Dollar(1)

        assertTrue(fiveDollars != oneDollar)
    }
}
