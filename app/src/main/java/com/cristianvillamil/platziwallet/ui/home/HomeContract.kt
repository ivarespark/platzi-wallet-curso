package com.cristianvillamil.platziwallet.ui.home

import androidx.lifecycle.LiveData


// Se hace una interface como contrato para que se comuniquen todos los elementos
interface HomeContract {
    // Se declararan todas las funciones que fan a tener ambs interfaces
    interface View{
        fun showLoader()

        fun hideLoader()

        fun showFavoriteTransfers(favoriteTransfer: List<FavoriteTransfer>)

    }

    interface Presenter{
        fun retrieveFavoriteTransfers()
        fun getPercentageLiveData() : LiveData<String>
    }

    interface OnResponseCallback{
        fun onResponse( favoriteList : List<FavoriteTransfer>)

    }
}