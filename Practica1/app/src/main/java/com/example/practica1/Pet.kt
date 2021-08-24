package com.example.practica1

class Pet {
    var id: Int = 0
    var name: String = ""
    var species: String = ""
    var breed: String = ""
    var age: Int = 0

    constructor (id: Int, name: String, species: String, breed: String, age: Int){
        this.id = id
        this.name = name
        this.species = species
        this.breed = breed
        this.age = age
    }

    fun feed(): String {
        val text =
            when(species){
                "cat" -> {
                    name + " is eating its food for its breed " + breed
                }
                "dog" -> {
                    name + " is eating its food for its breed " + breed
                }
                else -> {
                    "idk"
                }
            }
        return text
    }

    fun sound(): String {
        val text =
            when(species){
                "cat" -> {
                    "meow meow"
                }
                "dog" -> {
                    "woof woof"
                }
                else -> {
                    "idk"
                }
            }
        return text
    }

    fun play(): String {
        val text =
            when(species){
                "cat" -> {
                    name + " is playing estambre xd"
                }
                "dog" -> {
                    name + " is playing pelota jsjsjs"
                }
                else -> {
                    "nada :("
                }
            }
        return text
    }
}