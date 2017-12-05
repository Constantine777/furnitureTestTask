package ru.furniture.testTask.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.furniture.testTask.models.OrderType;

import java.util.List;

public interface OrderTypeRepository extends CrudRepository <OrderType, String> {

    // List<OrderType> findAll();
    // List<OrderType> findByShortName(String typeName);
}
