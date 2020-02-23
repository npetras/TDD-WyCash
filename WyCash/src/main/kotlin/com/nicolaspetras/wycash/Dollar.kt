package com.nicolaspetras.wycash

class Dollar(var amount: Int = 0) {

    fun times(multiplier: Int): Dollar {
        return Dollar(this.amount * multiplier)
    }
}