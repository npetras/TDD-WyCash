package com.nicolaspetras.wycash

data class Dollar(val amount: Int = 0) {

    fun times(multiplier: Int): Dollar {
        return Dollar(this.amount * multiplier)
    }
}
