package com.nicolaspetras.wycash

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class DollarTest {
    @Test
    fun `test multiplication`() {
        val fiveDollars = Dollar(5)

        var product = fiveDollars.times(2)
        assertEquals(10, product)

        product = fiveDollars.times(3)
        assertEquals(15, product)


    }
}