package dk.cphbusiness

import dk.cphbusiness.states.Range

fun main(args: Array<String>) {
    val r1 = Range(1, 100, false)
    val r2 = Range(-5, Int.MAX_VALUE, true)
    val r3 = Range(0, 0, true)

    println(r1)
    println(r2)
    println(r3)
    }