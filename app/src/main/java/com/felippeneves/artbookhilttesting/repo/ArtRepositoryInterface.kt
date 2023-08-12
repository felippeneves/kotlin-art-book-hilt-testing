package com.felippeneves.artbookhilttesting.repo

import androidx.lifecycle.LiveData
import com.felippeneves.artbookhilttesting.model.ImageResponse
import com.felippeneves.artbookhilttesting.database.Art
import com.felippeneves.artbookhilttesting.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}