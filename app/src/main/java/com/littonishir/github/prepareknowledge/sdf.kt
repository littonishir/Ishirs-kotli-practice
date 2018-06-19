package com.littonishir.github.prepareknowledge


/**
 * Created by littonishir on 2018/6/19.
 */
class classutils {
    companion object {
        fun c1() {}

        fun c2() {}
    }
}

object objectutils {
    fun o1() {
    }

    fun o2() {
    }
}


fun main(args: Array<String>) {
    classutils.c1()
    classutils.c2()
    objectutils.o1()
    objectutils.o2()
}