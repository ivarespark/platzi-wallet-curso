package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
    companion object {
        val TYPE_ERROR = "typeError"
        val TYPE_SUCCESS = "typeSuccess"
    }

    fun getDialog(context : Context, type : String): AlertDialog.Builder {
        when (type) {
            TYPE_ERROR -> {
                return AlertDialog.Builder(context)
                    .setMessage("Hay error al momento de traer contenido")
            }
            TYPE_SUCCESS -> {
                return AlertDialog.Builder(context)
                    .setMessage("Contenido cargado exitosamente")
            }
        }
        return AlertDialog.Builder(context).setMessage("Necesitas añadir nuevo tipo")
    }
}