package com.pr7.kotlin_paging3_rickandmortyapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.pr7.kotlin_paging3_rickandmortyapi.databinding.ActivityMainBinding
import com.pr7.kotlin_paging3_rickandmortyapi.ui.MainViewModel
import com.pr7.kotlin_paging3_rickandmortyapi.ui.MyAdapter
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerview1.apply {
            myAdapter= MyAdapter()
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=myAdapter
        }
        initViewModel()
    }

    private fun initViewModel() {
        val viewModel  = ViewModelProvider(this).get(MainViewModel::class.java)
        lifecycleScope.launch {
            viewModel.getListData().collectLatest {
                myAdapter.submitData(it)



            }
        }
    }
}