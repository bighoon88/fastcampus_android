package com.example.myapplication.Kotlin

fun main(array: Array<String>) {

//    val fourFundamental : FourFundamental = FourFundamental(4, 5)
//    fourFundamental.plus()
//    fourFundamental.minus()
//    fourFundamental.mutiplication()
//    fourFundamental.division()

//    val bankAcount : BankAcount = BankAcount()
//    bankAcount.createAcount("taehoon", "881202")
//    bankAcount.checkBalance()
//    bankAcount.inBalance(30000)
//    bankAcount.outBalance(10000)
//    bankAcount.checkBalance()

//    val tv : Tv = Tv()
//    tv.changeTv()
//    tv.turnChanel("up")
//    tv.turnChanel("up")
//    tv.turnChanel("down")
//    tv.changeTv()
//    tv.turnChanel("up")
//    tv.turnChanel("up")

    val calculator1 = Calculator1()
    println(calculator1.plus(4, 5))
    println(calculator1.minus(4, 5))
    println(calculator1.multiply(4, 5))
    println(calculator1.divide(4, 5))

    println()

    val calculator2 = Calculator2()
    println(calculator2.plus(1, 2, 3, 4, 5))
    println(calculator2.minus(10, 1, 2, 3))
    println(calculator2.multiply(1,2,3))
    println(calculator2.divide(10,2,3))

    println()

    val calculator3 = Calculator3(3)
    calculator3.plus(5).minus(5)
    //---------/ -> Calculator3(3)
    //-------------------------/ -> Calculator3(8)
    //------------------------------------------/ -> Calculator3(8).minus(5)
    // -> Chaining(체이닝)
}

// 1) 사칙 연산을 수행할 수 있는 클래스

class FourFundamental{
    val a: Int
    val b: Int

    constructor(a: Int, b: Int) {
        this.a = a
        this.b = b
    }

    fun plus() {
        println(a+b)
    }

    fun minus() {
        println(a-b)
    }

    fun mutiplication() {
        println(a*b)
    }

    fun division() {
        println(a/b)
    }
}

// 2) 은행계좌 만들기
//  - 계좌새성 기능 (이름, 생년 월일)
//  - 잔고를 확인 하는 기능
//  - 출금 기능
//  - 예금 기능

class BankAcount() {
    var acount: String = ""
    var balance: Int = 0
    fun createAcount(name: String, birth: String) {
        println("생년월일이 $birth 인 $name 의 계좌가 생성 되었습니다.")
        acount = "$birth$name"
    }

    fun checkBalance() {
        println(acount)
        println("잔고를 확인 하는 기능")
        println(balance)
    }

    fun outBalance(out: Int) {
        println("출금 기능")
        if(balance != 0) {
            balance = balance - out
            println(balance)
        } else {
            println("잔액이 0원 입니다.")
        }
    }

    fun inBalance(input: Int) {
        println("예금 기능")
        balance = balance + input
        println("잔액이 $balance")
    }
}

// 3) TV 클래스
//  - on/off 기능
//  - 채널을 돌리는 기능
//  - 초기 채널은 (S사 M사 K사 3개)

class Tv() {
    var status: String = "off"
    var chanel: Int = 5
    fun changeTv() {
        if (status == "off") {
            status = "on"
        } else {
            status = "off"
            chanel = 5
        }
        println(status)
    }
    fun turnChanel(button: String) {
        if (status != "off") {
            if (button == "up") {
                chanel+=1
            }
            else if (button == "down") {
                chanel-=1
            }
            else {
                println("오류입니다.")
            }
            println(chanel)
        } else {
            println("")
        }

    }
    fun initialChanel() {

    }
}

// 가장 쉬운 방법
// 1) 사칙 연산을 수행할 수 있는 클래스
class Calculator1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        // 리턴은 몫만 한다
        return a / b
    }
}

class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result = numbers[0]
        for ( i in 0 until numbers.size) {
            if ( i != 0) {
                result = result - numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result = 1
        numbers.forEach {
            if(it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result = numbers[0]
        numbers.forEachIndexed{ index, value ->
            if (index != 0) {
                if (value != 0) {
                    result = result / value
                }
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int) {
    fun plus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }
}