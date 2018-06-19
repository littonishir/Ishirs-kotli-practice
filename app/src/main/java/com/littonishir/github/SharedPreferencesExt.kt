package com.littonishir.github

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by littonishir on 2018/6/19.
 * @param context
 * @param key
 * @param value
 * @param filename
 */
class SharedPreferencesExt<T>(private val context: Context, private val key: String, private val value: T, private val filename: String = "litton")
    : ReadWriteProperty<Any?, T> {
    private val prefs by lazy {
        context.getSharedPreferences(filename, Context.MODE_PRIVATE)
    }
    
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        with(prefs.edit()) {
            when (value) {
                is Long -> putLong(key, value)
                is Int -> putInt(key, value)
                is Boolean -> putBoolean(key, value)
                is String -> putString(key, value)
                is Float -> putFloat(key, value)
                else -> throw IllegalArgumentException("Unsupported type.")
            }
        }.apply()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return when (value) {
            is Long -> prefs.getLong(key, value)
            is Int -> prefs.getInt(key, value)
            is Boolean -> prefs.getBoolean(key, value)
            is String -> prefs.getString(key, value)
            is Float -> prefs.getFloat(key, value)
            else -> throw IllegalArgumentException("Unsupported type")
        } as T
    }
}