package com.pr7.kotlin_paging3_rickandmortyapi.ui


import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.pr7.kotlin_paging3_rickandmortyapi.data.model.Result
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.pr7.kotlin_paging3_rickandmortyapi.databinding.RecyclerviewItemBinding

class MyAdapter constructor(

):PagingDataAdapter<Result,MyAdapter.MyViewHolder>(DiffUtilCallBack()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(view)

    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=getItem(position)
        holder.binding.apply {
            textviewcharacter.text=currentItem?.name
            Glide.with(imageviewcharacter)
                .load(currentItem?.image)
                .circleCrop()
                .into(imageviewcharacter)
        }
    }

   inner class MyViewHolder(val binding: RecyclerviewItemBinding):RecyclerView.ViewHolder(binding.root)





    class DiffUtilCallBack():DiffUtil.ItemCallback<Result>(){
        override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Result, newItem: Result): Boolean {
            return oldItem.name == newItem.name
                    && oldItem.species == newItem.species
        }
    }
}