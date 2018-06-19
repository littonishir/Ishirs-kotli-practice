package com.littonishir.github.prepareknowledge

import android.util.Log


/**
 * Created by littonishir on 2018/6/19.
 */



class CC : AA, BB {
    var i = 8
        set(value)  {
            println(value)
            field=value
        }


    override fun foo() {
        try {

        }catch (e:Exception){

        }
//        super<AA>.foo()
//        super<BB>.foo()
        i = 7
        Log.e("ishir", "CC")

    }
}

