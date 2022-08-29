package com.example.WebestCalculationMethod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    //Сервис с единсвенным методом для получения данных о цене товара из кэша, если в кэше данных нет, идет обращение
    // во внешний апи

    @Autowired
    APIService apiService;

    float getPriceByItemId(long id) {
        // Сейчас используетс заглушка, можно было бы дописать реальное обращение к кэшу и в случае,
        // если данных в кэше нет организовать обращение по внешнему апи
        return 1;
    }
}
