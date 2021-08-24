package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private lateinit var txvInfo: TextView

    var pet1 = Pet(1, "garfield", "cat", "siamés", 3)
    var pet2 = Pet(2, "gato con botas", "cat", "pardo", 2)
    var pet3 = Pet(3, "gato sin botas", "cat", "pardo pero sin botas", 5)
    var pet4 = Pet(4, "cheems", "dog", "shiba", 1)
    var pet5 = Pet(5, "dogo", "dog", "corgi", 4)
    var pet6 = Pet(6, "pato", "dog", "husky", 3)


    var myList = mutableListOf<Pet>(pet1,pet2,pet3,pet4,pet5,pet6)
    var myList2 = mutableListOf<Pet>()

    var contador: Int = 0
    var contadorMax: Int = -1

    fun makeSound(view: View) {

        var text: String = myList[contador].sound()
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    fun play(view: View) {
        var text: String = myList[contador].play()
        Toast.makeText(this,  text, Toast.LENGTH_LONG).show()
    }

    fun eat(view: View) {
        var text: String = myList[contador].feed()
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    fun getPreviousPet(view: View) {
        if(contador > 0){
            contador--
        }else{
            Toast.makeText(this, "theres no more pets " + contador, Toast.LENGTH_LONG).show()
        }
        txvInfo = findViewById(R.id.txvInfo)
        txvInfo.text = "Your animal is a: " + myList[contador].species + " its name is " +
                "" + myList[contador].name + " its age is " + myList[contador].age + " and its race is " + myList[contador].breed
    }

    fun createNewPet(view: View) {
        if(contadorMax<5)
        {
            contadorMax++
            contador=contadorMax
        }
        else
            Toast.makeText(this, "theres no more pets ", Toast.LENGTH_LONG).show()
        txvInfo = findViewById(R.id.txvInfo)
        txvInfo.text = "Your animal is a: " + myList[contador].species + " its name is " +
                "" + myList[contador].name + " its age is " + myList[contador].age + " and its race is " + myList[contador].breed
    }

    fun getNextPet(view: View) {
        if(contador < contadorMax){
            contador++
        }else{
            Toast.makeText(this, "theres no more pets " + contador, Toast.LENGTH_LONG).show()
        }
        txvInfo = findViewById(R.id.txvInfo)
        txvInfo.text = "Your animal is a: " + myList[contador].species + " its name is " +
                "" + myList[contador].name + " its age is " + myList[contador].age + " and its race is " + myList[contador].breed
    }

}