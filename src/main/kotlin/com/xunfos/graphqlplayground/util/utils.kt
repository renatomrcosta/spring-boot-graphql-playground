package com.xunfos.graphqlplayground.util

import kotlin.system.measureTimeMillis

fun getCurrentThreadName() = Thread.currentThread().name
fun trace(msg: Any) = println("[${getCurrentThreadName()}] $msg")
inline fun withExecutionTime(block: () -> Unit) = measureTimeMillis {
    block()
}.run { println("Total Execution time: ${this}ms") }

