package com.example.castom_list

data class User
    (val avatar:Int,
    val name:String,
    val age: Int) {
    override fun toString(): String {
        return "$avatar,$name, $age"
    }
}