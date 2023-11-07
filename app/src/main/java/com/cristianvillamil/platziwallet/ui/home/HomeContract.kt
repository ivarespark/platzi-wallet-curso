package com.cristianvillamil.platziwallet.ui.home


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
    }

    interface OnResponseCallback{
        fun onResponse( favoriteList : List<FavoriteTransfer>)

    }
}