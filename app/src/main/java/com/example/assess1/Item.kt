package com.example.assess1

data class Item(var name:String)
object Supplier{
    val items= listOf<Item>(
        Item("C"),
        Item("C++"),
        Item("Java"),
        Item("PHP"),
        Item("JavaScript")
    )
}