package com.example.preparatlist.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UDEFIND_ID
) {

    companion object {
        const val UDEFIND_ID = -1
    }
}
