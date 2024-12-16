package com.example.appprecafeteriaprova

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

        private var _menu = MutableLiveData<List<MenuModel>>()
        val menu: LiveData<List<MenuModel>> = _menu

        fun updateUser(tipus: String, nom: String ,quantitat: Int, preu: Int) {
            val menuItem = MenuModel(tipus, nom, quantitat, preu)

            val menuActual = _menu.value?.toMutableList() ?: mutableListOf()

            if (tipus == "beguda") {
                menuActual.add(1, menuItem)
            } else if (tipus == "primerPlat") {
                menuActual.add(0, menuItem)
            } else {
                menuActual.add(menuItem)
            }

            _menu.value = menuActual
        }

        fun obtenirTotal(tipus: String): Int {
            if (tipus == "beguda") {
                return ((_menu.value?.get(1)?.quantitat ?: 0) * (_menu.value?.get(1)?.preu ?: 0))
            }
            else {
                return ((_menu.value?.get(0)?.quantitat ?: 0) * (_menu.value?.get(0)?.preu ?: 0))
            }
        }
        fun obtenirNom(tipus: String): String? {
            if (tipus == "beguda") {
                return _menu.value?.get(1)?.nom
            }
            else {
                return _menu.value?.get(0)?.nom
            }
        }
}
