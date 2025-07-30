package com.example.myapplication.Data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.Data.model.User


@Dao
interface UserDao {
    @Query("SELECT * FROM users WHERE username = :username")
    suspend fun getUser(username: String): User?

    @Insert
    suspend fun insertUser(user: User)
}
