package com.example.myapplication.Kotlin


fun main(array: Array<String>) {
//    Midfirst()
//    println(Midsecond(79))
//    println(Midthird(99))
    Midfourth()
}


// 1번 문제
// List를 두개 만든다
// 첫번째 List에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인한후
// 짝수면 True 홀수면 False를 넣어준다

fun Midfirst() {
    val list1 = MutableList(9, { 0 })
    val list2 = MutableList(9, { true })

    for (i in 0..8) {
        list1[i] = i + 1
    }
    println(list1)

    list1.forEachIndexed { index, value ->
        list2[index] = value % 2 == 0
    }
    println(list2)
}

// 2번 문제
// 학점을 구하자
// 80 - 90 -> A
// 70 - 79 -> B
// 60 - 69 -> C
// 나머지 F

fun Midsecond(score: Int): String {
    when (score) {
        in 90..100 -> {
            return "A"
        }
        in 80..90 -> {
            return "B"
        }
        in 70..79 -> {
            return "C"
        }
        else -> {
            return "F"
        }
    }
}

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다

fun Midthird(number: Int): Int {
    val a: Int = number / 10
    val b: Int = number % 10

    return a + b
}
// 4번 문제
// 구구단을 출력하자

fun Midfourth() {
    for (x in 1..9) {
        for (y in 1..9) {
            println("$x X $y = $x*$y")
        }
    }
}