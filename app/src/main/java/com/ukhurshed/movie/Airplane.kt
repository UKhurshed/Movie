package com.ukhurshed.movie

class Airplane (var countSeat: Int, var model: String?, val produceYear: Int) {

    override fun toString(): String {
        return "{$model; $produceYear; $countSeat}"
    }
}