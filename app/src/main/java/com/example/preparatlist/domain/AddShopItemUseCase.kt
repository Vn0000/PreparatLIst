package com.example.preparatlist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItem(shopItemId: ShopItem) {
        shopListRepository.addShopItem(shopItemId)
    }
}