package com.example.preparatlist.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList():List<ShopItem>{
        return shopListRepository.getShopList()
    }
}