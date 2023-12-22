package com.example.rockerpaperscissors

fun main(){

    var computerChoice=""
    //var playerChoice=""

    println("Rock, Paper, Scissors?")
    print("Enter your choice: ")

    val playerChoice=readln().lowercase()



    val randomNumber=(1..3).random()

    when(randomNumber) {
        1-> computerChoice="rock"
        2-> computerChoice="paper"
        3-> computerChoice="scissor"
    }

    println("Computer Chose "+computerChoice)

    val winner= when {
        playerChoice==computerChoice-> "TIE"

        playerChoice=="rock" && computerChoice == "scissor" -> "Player Won!"
        playerChoice=="paper" && computerChoice == "rock" -> "Player Won!"
        playerChoice=="scissor" && computerChoice == "paper" -> "Player Won!"

        else -> "Computer"
    }

    println(winner)
}