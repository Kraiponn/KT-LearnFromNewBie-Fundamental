package com.codemakerlab.ktlearnfromnewbie.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codemakerlab.ktlearnfromnewbie.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        initInstance()

    }

    private fun initInstance() {

    }

}




