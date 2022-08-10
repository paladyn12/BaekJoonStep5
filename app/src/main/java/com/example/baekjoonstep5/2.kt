package com.example.baekjoonstep5

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var countArray = Array(10001,{false})
    for(i in 0..10000) if(d(i) <= 10000) countArray[d(i)] = true
    for(i in 0..10000) if(countArray[i] == false) println(i)
}

fun d(n : Int) : Int {
    var newN = n
    var sum = 0
    sum += newN
    while(newN>=10){
        sum += newN%10
        newN /= 10
    }
    sum += newN
    return sum
}