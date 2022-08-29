package com.example.WebestCalculationMethod.controller;

import com.example.WebestCalculationMethod.model.Basket;
import com.example.WebestCalculationMethod.model.CalculatedBasket;
import com.example.WebestCalculationMethod.service.CostCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class CostCalculationController {
    //Контроллер с единственным методом расчета стоимости корзины покупателя

    @Autowired
    private CostCalculationService costCalculationService;

    @PostMapping(path = "/basketTotalCost")
    public CalculatedBasket calculatedBasket(@ModelAttribute Basket basket) {
        // проверить правильность введенных данных о способе оплаты и актуальность адреса пользователя,
        // возможно это значение пусто и его нужно указать в дальнейшемплаты для успешного заказа
        return costCalculationService.calculateBasket(basket);
    }
}
