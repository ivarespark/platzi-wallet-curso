package com.cristianvillamil.platziwallet.ui.observable

interface Observer {
    fun notifyChanged(newValue: Double)
}