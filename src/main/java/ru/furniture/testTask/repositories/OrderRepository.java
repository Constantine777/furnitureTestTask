package ru.furniture.testTask.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.furniture.testTask.models.Orderorder;


import java.util.List;


@Repository
public interface OrderRepository extends CrudRepository<Orderorder, Long> {
    List<Orderorder> findAll();
    List<Orderorder> findById (Long id);
    Orderorder save(Orderorder persisted);
    void delete(Orderorder persisted);

}



