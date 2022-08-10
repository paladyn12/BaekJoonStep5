package com.example.baekjoonstep5

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var n = nextInt()
    var count = 0
    for(i in 1..n){
        if(i<100) count++
        else if(i==1000){}
        else{
            if((i/100 - ((i%100)/10) == ((i%100)/10) - i%10)) count++
        }
    }
    print(count)
}