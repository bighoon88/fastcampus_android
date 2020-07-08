package com.example.myapplication.Kotlin


// 과제
// Night, Monster (부모) -> Charactor
// SuperNight, SuperMonster (자식)

fun main(args: Array<String>) {
    val monster = SuperMonster2(100, 10)
    val night = SuperNight2(130, 8)
    monster.attack(night)
    monster.bite(night)
}

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다
// - 부모 클래스는 자식 클래스의 타입이 아니다 !

open class Charactor(var hp: Int, val power: Int) {
    fun attack(charactor: Charactor, power: Int = this.power) {
        charactor.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("${javaClass.simpleName}의 남은 체력은 $hp 입니다")
        } else {
            println("사망했습니다")
        }
    }
}


// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스 선행되서 인스턴스화 되어야 한다
class SuperMonster2(hp: Int, power: Int) : Charactor(hp, power) {
    fun bite(charactor: Charactor) {
        super.attack(charactor, power + 2)
    }
}

class SuperNight2(hp: Int, power: Int) : Charactor(hp, power) {
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}