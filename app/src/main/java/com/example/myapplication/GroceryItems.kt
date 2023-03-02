package com.example.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "grocery_items")
data class GroceryItems {

    @ColumnInfo(name = "itemName")
    var itemName: String,

    @ColumnInfo(name = "itmeQuantity")
    var itemQuantity: String,

    @ColumnInfo(name = "itmePrice")
    var itemPrice: int,

}