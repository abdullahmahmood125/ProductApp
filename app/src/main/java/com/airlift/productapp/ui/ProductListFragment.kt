package com.airlift.productapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airlift.productapp.R
import dagger.hilt.android.AndroidEntryPoint

private const val ARG_INSTANCE_ID = "id"
private const val ARG_INSTANCE_TITLE = "title"


@AndroidEntryPoint
class ProductListFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

//    private lateinit var binding:


            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_INSTANCE_ID)
            param2 = it.getString(ARG_INSTANCE_TITLE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_product_list, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(id: String, title: String) =
            ProductListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_INSTANCE_ID, param1)
                    putString(ARG_INSTANCE_TITLE, param2)
                }
            }
    }
}