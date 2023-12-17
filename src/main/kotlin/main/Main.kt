package main

import questions.arrays.*

fun main(args: Array<String>) {
    println(DailyTemperatures.dailyTemperatures(intArrayOf(73,74,75,71,69,72,76,73)).map { it })
}