package com.rps.recyclerviewwithmergeadapterexample.datasources

import com.rps.recyclerviewwithmergeadapterexample.R
import com.rps.recyclerviewwithmergeadapterexample.models.Banner
import com.rps.recyclerviewwithmergeadapterexample.models.MyDetail
import com.rps.recyclerviewwithmergeadapterexample.models.Leader

object DataSource {
    fun getUser() = ArrayList<Leader>().apply {
        add(Leader(1, "RabindraNathTagore", "https://upload.wikimedia.org/wikipedia/commons/d/d1/Rabindranath_Tagore.jpg"))
        add(Leader(2, "Bal Ganga Dhar Tilak", "https://www.indiamyworld.com/hindi/wp-content/uploads/2018/03/bal-gangadhar-tilak-1050x1553.jpg"))
        add(Leader(3, "APJ ABDUL KALAM", "https://img.republicworld.com/republic-prod/stories/promolarge/xxhdpi/xk4uyekgqbpdp5so_1588946331.jpeg"))
        add(Leader(4, "Sardar Vallabhbhai Patel", "https://cdn.dnaindia.com/sites/default/files/styles/full/public/2019/09/26/871046-sardar-vallabhai.jpg"))
        add(Leader(5, "Bhagat Singh", "https://miro.medium.com/max/650/1*0UAEqIiTSOolfuQuId4org.jpeg"))

    }
    fun getBanner() = Banner(R.drawable.car_parking)

    fun aboutMe() :MyDetail {
        val myDetail = MyDetail(1, "Rohit Prakash(R.P.S)", "I am an Android Application Developer. \n I like to develop Applications ....")
        return myDetail
    }
}