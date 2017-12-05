package ru.furniture.testTask.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.furniture.testTask.models.OrderTypeGroup;

import java.util.List;

public interface OrderTypeGroupRepository extends CrudRepository <OrderTypeGroup, String>{

   // List<OrderTypeGroup> findAll();
   // List<OrderTypeGroup> findByShortName(String groupName);
}
