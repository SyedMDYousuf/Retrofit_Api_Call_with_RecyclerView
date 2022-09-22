package com.syedmohammedyousuf.retrofit_api_call

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET(value = "posts")
    fun getDate():Call<List<MyDataItem>>
}