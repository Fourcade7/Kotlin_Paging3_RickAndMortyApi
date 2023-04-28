package com.pr7.kotlin_paging3_rickandmortyapi.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.pr7.kotlin_paging3_rickandmortyapi.data.network.RetroService
import com.pr7.kotlin_paging3_rickandmortyapi.data.network.Retroinstance
import com.pr7.kotlin_paging3_rickandmortyapi.data.network.paging.ResultPagingSource
import kotlinx.coroutines.flow.Flow

class MainViewModel constructor(

):ViewModel() {
    lateinit var retroService: RetroService

    init {
        retroService = Retroinstance.getRetrofitInstance().create(RetroService::class.java)
    }

    fun getListData(): Flow<PagingData<com.pr7.kotlin_paging3_rickandmortyapi.data.model.Result>> {
        return Pager (config = PagingConfig(pageSize = 20, maxSize = 200),
            pagingSourceFactory = {ResultPagingSource(retroService)}).flow.cachedIn(viewModelScope)
    }
}