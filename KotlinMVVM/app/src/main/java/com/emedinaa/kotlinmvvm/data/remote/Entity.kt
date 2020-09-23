package com.emedinaa.kotlinmvvm.data.remote

import com.emedinaa.kotlinmvvm.domain.Museum

/**
 * @author Eduardo Medina
 */
data class MuseumResponse(val status: Int?, val msg: String?, val data: List<Museum>?) {
    fun isSuccess(): Boolean = (status == 200)
}