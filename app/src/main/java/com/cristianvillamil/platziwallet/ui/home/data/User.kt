package com.cristianvillamil.platziwallet.ui.home.data

// Patron builder
class User private constructor (private val userName: String, private val password: String) {
    class Builder{
        var userName: String = ""
        var password: String ?= null

        fun setUsername(newUserName : String) : Builder {
            this.userName = newUserName
            return this
        }

        fun setPassword(newPassword : String): Builder {
            this.password = newPassword
            return this
        }

        fun build() : User {
            return User(userName, password ?: "") // si password es nulo, se pasa un vacio

        }
    }
}