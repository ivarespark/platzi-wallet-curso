package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User

// Presentador es un puente entre capas
class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter {

    private val homeInteractor: HomeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers() {
        view.showLoader()
        homeInteractor.retrieveFavoriteTransfersFromCache(object : HomeContract.OnResponseCallback {

            override fun onResponse(favoriteList: List<FavoriteTransfer>) {
                UserSingleton.getInstance().userName = "Arturo"
                // Se aplica patron builder
                val user = User.Builder()
                    .setUsername("Usuario")
                    .setPassword("fdsfdsafsadf")
                    .build()
                view.hideLoader()
                view.showFavoriteTransfers(favoriteList)
            }
        })
    }
}