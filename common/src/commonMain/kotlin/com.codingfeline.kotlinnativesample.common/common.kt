package com.codingfeline.kotlinnativesample.common

expect fun platformName(): String

fun createApplicationMessage(): String {
    return "Kotlin rocks on ${platformName()}"
}