package com.example.WebestCalculationMethod.service;

import org.springframework.stereotype.Service;

@Service
public class APIService {
    // Сервис для обращение к внешнему апи для получения цены о товаре
    float getPriceByItemId(long id){
        //Вместо заглушки было бы удобно организовать обращение к апи через Feign
        return 1;
    }
}
