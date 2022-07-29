package com.mitchellehope.mypost

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mitchellehope.mypost.databinding.PostListLitemBinding
import java.security.AccessControlContext

class PostRVAdapter(var context: Context,var postList: List<Post>):
RecyclerView.Adapter<PostRVAdapter.RetrofitViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
        var binding=PostListLitemBinding
            .inflate(LayoutInflater.from(context),parent,false)
        return RetrofitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RetrofitViewHolder, position: Int) {
        var currentPost=postList.get(position)
        with(holder.binding) {
            tvUseId.text=currentPost.userId.toString()
            tvBody.text=currentPost.body.toString()
            tvId.text=currentPost.id.toString()
            tvTittle.text=currentPost.id.toString()
        }

    }

    override fun getItemCount(): Int {
        return postList.size
    }
    class RetrofitViewHolder(var binding: PostListLitemBinding):
        RecyclerView.ViewHolder(binding.root){

    }


}














