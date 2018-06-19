package com.littonishir.github

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val mutableListOf = mutableListOf<Int>(1, 2, 3)
        mutableListOf.swap(
                0,
                2
        )
        mutableListOf
        val g = Games("而恶","1.2")
        println(g)


        println("aaaavvv".times(2))
    }

    operator fun String.times(int: Int): String{
        val stringBuilder = StringBuilder()
        for(i in 0 until int){
            stringBuilder.append(this)
        }
        return stringBuilder.toString()
    }
}
