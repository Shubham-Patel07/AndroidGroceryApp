package com.example.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grocery_items")
data class GroceryItems (

    @ColumnInfo(name = "itemName")
    var itemName: String,

    @ColumnInfo(name = "itemQuantity")
    var itemQuantity: String,

    @ColumnInfo(name = "itemPrice")
    var itemPrice: String

){
    @PrimaryKey(autoGenerate = true)
    var id: Int ? = null
}