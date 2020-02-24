package com.nicolaspetras.wycash

class Dollar(val amount: Int = 0) {

    fun times(multiplier: Int): Dollar {
        return Dollar(this.amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        val otherDollar = other as Dollar
        return otherDollar.amount == this.amount
    }

    override fun hashCode(): Int {
        return amount
    }
}
