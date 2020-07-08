package com.example.myapplication.Kotlin


// 과제
// Night, Monster (부모)
// SuperNight, SuperMonster (자식)

fun main(args: Array<String>) {
    val superNight : SuperNight = SuperNight(20, 4, true)
    val superMonster : SuperMonster = SuperMonster(10, 4, true)
    superNight.attack(superMonster)
    superMonster.attack(superNight)
    superNight.attack(superMonster)
    superMonster.attack(superNight)
    superNight.attack(superMonster)
    superMonster.attack(superNight)
    superNight.attack(superMonster)
    superMonster.attack(superNight)
}

open class Night1(var hp: Int, val power: Int, var status: Boolean) {
    open fun attack(monster1: Monster1) {
        monster1.defense(power, status)
    }

    open fun defense(damage: Int, status: Boolean) {
        if (status) {
            println(status)
            hp -= damage
            println(hp)
            if (hp > 0) {
                println("기사 현재 체력은 $hp 입니다.")
            } else {
                println("기사가 죽었습니다.")
                this.status = false
            }
        } else {
            println("기사가 죽었습니다.")
            this.status = false
        }
    }
}

open class Monster1(var hp: Int, val power: Int, var status: Boolean) {
    open fun attack(night1: Night1) {
        night1.defense(power, status)
    }

    open fun defense(damage: Int, status: Boolean) {
        if (status) {
            println(status)
            hp -= damage
            println(hp)
            if (hp > 0) {
                println("몬스터 현재 체력은 $hp 입니다.")
            } else {
                println("몬스터가 죽었습니다.")
                this.status = false
            }
        } else {
            println("몬스터가 죽었습니다.")
            this.status = false
        }
    }
}

class SuperNight(hp: Int, power: Int, status: Boolean): Night1(hp, power, status) {
    override fun attack(monster1: Monster1) {
        super.attack(monster1)
    }

    override fun defense(damage: Int, status: Boolean) {
        super.defense(damage, status)
    }
}

class SuperMonster(hp: Int, power: Int, status: Boolean): Monster1(hp, power, status) {
    override fun attack(night1: Night1) {
        super.attack(night1)
    }

    override fun defense(damage: Int, status: Boolean) {
        super.defense(damage, status)
    }
}