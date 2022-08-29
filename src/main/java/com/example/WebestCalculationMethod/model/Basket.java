package com.example.WebestCalculationMethod.model;

import com.example.WebestCalculationMethod.entity.Item;
import com.example.WebestCalculationMethod.model.type.PaymentType;
import lombok.Getter;

import java.util.List;

@Getter
public class Basket {
// Обьект типа Корзина, используется для получения входных данных для метода calculatedBasket
    private List<Item> items;
    private PaymentType payment_type;
    private int id_client_address;

}
