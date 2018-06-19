package com.littonishir.github


/**
 * auth : littonishir
 * date : 2018/6/14
 * gith : https://github.com/littonishir
 */

fun <T> MutableList<T>.swap(index1:Int,index2:Int){
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}