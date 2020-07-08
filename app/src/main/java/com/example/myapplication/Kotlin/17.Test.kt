package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
//    first()
//    second(79)
//    third(99)
    fourth()
}


// 1번 문제
// List를 두개 만든다
// 첫번째 List에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인한후
// 짝수면 True 홀수면 False를 넣어준다

fun first() {
    var firstList = mutableListOf<Int>()
    var a: Int = 0
    while (a <= 9) {
        firstList.add(a)
        a++
    }
    println(firstList)
    firstList.forEach(){
        println(it%2 == 0)
    }
}

// 2번 문제
// 학점을 구하자
// 80 - 90 -> A
// 70 - 79 -> B
// 60 - 69 -> C
// 나머지 F

fun second(score: Int) {
    if (80 < score && score <= 90) {
        println("A")
    }
    else if (70 <= score && score < 80) {
        println("B")
    }
    else if (60 <= score && score < 70) {
        println("C")
    }
    else {
        println("F")
    }
}

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다

fun third(number: Int) {
    val number1: Int = number / 10
    val number2: Int = number % 10
    println(number1 + number2)
}

// 4번 문제
// 구구단을 출력하자

fun fourth() {
    var a: Int = 0
    while ( a < 9) {
        a++
        var b: Int = 0
        while ( b < 9) {
            b++
            println("구구단 " + a + " * " + b + " = " + a*b)
        }
    }
}