package com.airlift.productapp.Helper

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class ViewModelFactory(val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(UserLoginViewModel::class.java)) {
//            return UserLoginViewModel(
//                userLoginRepository = UserLoginRepository(
//                    dataSource = UserLoginDataSource(context = context), context
//                ),
//                context = context
//            ) as T
//        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}