package com.example.preparatlist.domain

interface ShopListRepository {

    fun addShopItem(shopItemId: ShopItem)

    fun deliteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}