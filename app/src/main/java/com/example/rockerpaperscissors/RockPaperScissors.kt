package com.example.rockerpaperscissors

fun main(){

    var computerChoice=""
    var playerChoice=""




    while(true) {

        println("Rock, Paper, Scissor or Exit?")
        print("Enter your choice: ")
        playerChoice=readln().lowercase()

        if (playerChoice == "rock" || playerChoice == "paper" || playerChoice == "scissor") {

            val randomNumber = (1..3).random()

            when (randomNumber) {
                1 -> computerChoice = "rock"
                2 -> computerChoice = "paper"
                3 -> computerChoice = "scissor"
            }

            println("Computer Chose $computerChoice")

            val winner = when {
                playerChoice == computerChoice -> "TIE"

                playerChoice == "rock" && computerChoice == "scissor" -> "Player Won!"
                playerChoice == "paper" && computerChoice == "rock" -> "Player Won!"
                playerChoice == "scissor" && computerChoice == "paper" -> "Player Won!"

                else -> "Computer"
            }

            println(winner)
            println()
        }

        else if (playerChoice == "exit") {
            break
        }

        else {
            println("\nEnter valid input!!")
        }
    }

}