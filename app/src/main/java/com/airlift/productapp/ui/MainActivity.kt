package com.airlift.productapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.airlift.productapp.R

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                .add(android.R.id.content, ProductListFragment.newInstance("1", "Products")).commit();}

    }

    }
