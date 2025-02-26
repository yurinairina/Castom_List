package com.example.castom_list

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var customArrayAdapter: CustomArrayAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById<ListView>(R.id.user_list)

        var list = mutableListOf<User>()

        list.add(User(R.drawable.mersie, "Mишель Мерсье", 1939))
        list.add(User(R.drawable.katrin, resources.getString(R.string.katrina), 1943))
        list.add(User(R.drawable.dginalolob, resources.getString(R.string.dgina), 1927))
        list.add(User(R.drawable.odritotu, resources.getString(R.string.totuu), 1976))
        list.add(User(R.drawable.monica, resources.getString(R.string.monicab), 1964))
        list.add(User(R.drawable.marionkotiar, resources.getString(R.string.mkotar), 1975))

        customArrayAdapter = CustomArrayAdapter(this, list)
        customArrayAdapter.notifyDataSetChanged()
        listView.adapter = customArrayAdapter
    }
}



//        listView = findViewById(R.id.user_list)
//        // используем ArrayAdapter и определяем массив
//        val arrayAdapter: ArrayAdapter<*>
//        val users = arrayOf<User> ("Ирина", "Марина")
//        // получаем доступ к listView из XML-файла
//        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
//        listView.adapter = arrayAdapter
//
//        listView.onItemClickListener =
//            AdapterView.OnItemClickListener { _, view, position, _ ->
//                Toast.makeText(this, users[position], Toast.LENGTH_SHORT).show()
//
//            }
//        listView.onItemLongClickListener =
//            AdapterView.OnItemLongClickListener { _, view, position, _ ->
//                Toast.makeText(this, "position : $position", Toast.LENGTH_SHORT).show()
//            true
//            }
//    }
//}


//data class User (val name: String, val age: Int, val avatar: Int ){
//  var a = arrayOf("рпрп", 1, 1)
//      override fun toString(): String {
//     return "$name, $age, $avatar"
//    }
////}


//Задание по теме CustomListView
//Задача:
//Создайте список пользователей с кастомным отображением элементов, используя ListView и ArrayAdapter.
//
//Шаги выполнения:
//Создайте новый проект или используйте существующий.
//Добавьте в activity_main.xml ListView, который будет отображать список пользователей.
//Создайте data class User, содержащий:
//name: String
//age: Int
//avatar: Int (ссылка на ресурс изображения)
//Создайте кастомный layout (list_item.xml) для элемента списка:
//ImageView для аватара
//TextView для имени
//TextView для возраста
//Создайте CustomAdapter, унаследованный от ArrayAdapter, для связывания данных с ListView.
//Заполните ListView списком пользователей.