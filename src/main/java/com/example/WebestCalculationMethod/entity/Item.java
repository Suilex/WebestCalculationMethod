package com.example.WebestCalculationMethod.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ITEM")
@Data
@NoArgsConstructor
public class Item {
    // Основная сущность приложения - Товар, хранит все необходимые данные по товару и имеет данные в таблице
    // (этим и отличается от моделей). Возможно будут указываться доп данные которые будут подтягиваться из бд,
    // например, картинка, описание и тп
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int count;

    private float sum_by_position;
}
