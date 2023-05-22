package com.example.preparatlist.domain

class DeliteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deliteShopItem(shopItem: ShopItem){
        shopListRepository.deliteShopItem(shopItem)
    }
}