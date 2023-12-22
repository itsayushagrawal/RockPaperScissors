package com.example.rockerpaperscissors

fun main(){

    var computerChoice=""
    //var playerChoice=""

    println("Rock, Paper, Scissors?")
    println("Enter your choice: ")
    var playerChoice=readln()



    val randomNumber=(1..3).random()

    when(randomNumber) {
        1-> computerChoice="Rock"
        2-> computerChoice="Paper"
        3-> computerChoice="Scissor"
    }

    println(computerChoice)
}