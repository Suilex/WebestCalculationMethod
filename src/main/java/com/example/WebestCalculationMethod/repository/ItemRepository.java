package com.example.WebestCalculationMethod.repository;

import com.example.WebestCalculationMethod.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
// Возможно нужно будет подтянуть доп данные по товарам, которые хранятся в базе
}
