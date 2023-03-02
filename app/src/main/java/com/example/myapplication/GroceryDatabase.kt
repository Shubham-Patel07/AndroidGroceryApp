package com.example.myapplication

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = [GroceryItems :: class], version = 1)
abstract class GroceryDatabase : RoomDatabase() {

    abstract fun getGroceryDao() : GroceryDao
    companion object{
        @Volatile
        private var Instance : GroceryDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = Instance ?: synchronized(LOCK){
            Instance ?: createDatabase(context).also{
                Instance = it
            }
        }
        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext, GroceryDatabase :: class.java,
                "Grocery.db"
            ).build()
    }
}