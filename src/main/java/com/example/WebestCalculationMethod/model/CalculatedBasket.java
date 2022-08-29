package com.example.WebestCalculationMethod.model;

import com.example.WebestCalculationMethod.entity.Item;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CalculatedBasket {
    // Модель, которая нужна для компоновки данных о товаре и итоговой сумме по всей корзине
    private List<Item> items;
    private float totalSum;
}
