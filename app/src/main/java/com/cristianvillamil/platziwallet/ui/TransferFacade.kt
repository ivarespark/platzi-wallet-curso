package com.cristianvillamil.platziwallet.ui

class TransferFacade {
    // Patron fachada
    // encapsula 3 sistemas: security, analytics y transfer
    val analyticsManager : AnalyticsManager = AnalyticsManager()
    val securityManager = SecurityManager()
    val transferManager = TransferManager()

    fun transfer(){
        val token = securityManager.getToken()
        analyticsManager.registerTransfer(token)
        transferManager.transfer(token)
    }
}