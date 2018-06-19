package com.littonishir.github


object Settings {
    var email: String by SharedPreferencesExt(AppContext, "email", "","")
    var password: String by SharedPreferencesExt(AppContext, "password", "","")
}