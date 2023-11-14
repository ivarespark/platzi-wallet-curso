package com.cristianvillamil.platziwallet.ui

class TransferProxy {
    val MAX_TRANSFER_AMOUNT = 1000000
    val MIN_TRANSFER_AMOUNT = 100

    fun checkTransfer(amount : Double): String{
        return when{
            amount > MAX_TRANSFER_AMOUNT ->{
                "La transacción excede el monto máximo"
            }
            amount < MIN_TRANSFER_AMOUNT -> {
                "La transacción debe ser mayor a $MIN_TRANSFER_AMOUNT"
            }
            else -> {
                doTransfer(amount)
                "Transferencia se realizó correctamente"
            }
        }
    }

    private fun doTransfer(amount: Double){
    }
}