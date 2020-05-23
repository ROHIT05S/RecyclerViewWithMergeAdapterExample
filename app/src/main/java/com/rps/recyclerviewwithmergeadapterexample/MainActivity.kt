package com.rps.recyclerviewwithmergeadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import com.rps.recyclerviewwithmergeadapterexample.adapters.BannerAdapter
import com.rps.recyclerviewwithmergeadapterexample.adapters.MyDetailAdapter
import com.rps.recyclerviewwithmergeadapterexample.adapters.LeaderAdapter
import com.rps.recyclerviewwithmergeadapterexample.datasources.DataSource
import com.rps.recyclerviewwithmergeadapterexample.models.Leader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: MergeAdapter
    lateinit var myDetailAdapter: MyDetailAdapter
    lateinit var userVerticalAdapter: LeaderAdapter
    lateinit var bannerAdapter: BannerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDataInRecyclerView()
    }

    private fun setupDataInRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        userVerticalAdapter = LeaderAdapter(DataSource.getUser(),{ user->onUserItemClicked(user)})
        bannerAdapter = BannerAdapter(DataSource.getBanner())
        myDetailAdapter = MyDetailAdapter(DataSource.aboutMe())
        adapter = MergeAdapter(myDetailAdapter,  userVerticalAdapter,bannerAdapter)
        recyclerView.adapter = adapter
    }

    private fun onUserItemClicked(leader: Leader) {
        Toast.makeText(this,"User Clicked at=="+leader.name,Toast.LENGTH_SHORT).show()
    }
}
