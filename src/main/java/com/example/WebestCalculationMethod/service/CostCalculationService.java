package com.example.WebestCalculationMethod.service;

import com.example.WebestCalculationMethod.entity.Item;
import com.example.WebestCalculationMethod.model.Basket;
import com.example.WebestCalculationMethod.model.CalculatedBasket;
import com.example.WebestCalculationMethod.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostCalculationService {
    // Основной сервис для расчета стоимости товаров в корзине
    @Autowired
    CacheService cacheService;

    @Autowired
    ItemRepository itemRepository;

    public CalculatedBasket calculateBasket(Basket basket) {
        List<Item> items = basket.getItems();
        float totalSum = 0;

        for (Item item : items) {
            // Возможно стоит написать обработку ошибки в случае если кэш не найден и потерян доступ к внешнему апи,
            // для информирования пользователя чтобы он воспользовался сервисом позднее
            item.setSum_by_position(cacheService.getPriceByItemId(item.getId()) * item.getCount());
            totalSum += item.getSum_by_position();
        }

        return CalculatedBasket.builder()
                .items(items)
                .totalSum(totalSum).build();
    }
}
