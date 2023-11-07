package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor

// Presentador es un puente entre capas
class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter {

    private val homeInteractor: HomeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers() {
        view.showLoader()
        homeInteractor.retrieveFavoriteTransfersFromCache(object : HomeContract.OnResponseCallback {

            override fun onResponse(favoriteList: List<FavoriteTransfer>) {
                view.hideLoader()
                view.showFavoriteTransfers(favoriteList)
            }
        })
    }
}