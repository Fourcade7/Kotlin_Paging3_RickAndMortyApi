package com.pr7.kotlin_paging3_rickandmortyapi.data.model

data class Info(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: String
)