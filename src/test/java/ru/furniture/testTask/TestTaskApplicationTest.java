package ru.furniture.testTask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ru.furniture.testTask.models.Orderorder;
import ru.furniture.testTask.repositories.OrderRepository;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTaskApplicationTest {
    @Autowired
    private OrderRepository orderRepository;


    @Test
    public void contextLoads() {
    }
    @Test
    public void addOrdersTest(){
        int i;
        for (i = 1; i< 100; i++){
            Orderorder orderorder = new Orderorder();
            orderorder.setMnemonic("Chair" + i);

            orderRepository.save(orderorder);
        }

    }

    @Test
    public void findAllProductsTest(){
        List<Orderorder> orderorders = orderRepository.findAll();
        System.out.print(orderorders);
    }

}

