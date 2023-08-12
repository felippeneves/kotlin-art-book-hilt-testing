package com.felippeneves.artbookhilttesting.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.felippeneves.artbookhilttesting.R
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var fragmentFactory: ArtFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.fragmentFactory = fragmentFactory
        setContentView(R.layout.activity_main)
    }
}