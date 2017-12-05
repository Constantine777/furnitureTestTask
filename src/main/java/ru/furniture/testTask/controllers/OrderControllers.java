package ru.furniture.testTask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.furniture.testTask.models.Orderorder;
import ru.furniture.testTask.repositories.OrderRepository;

import java.util.List;


@Controller
@RequestMapping("/orderorder")
public class OrderControllers {
    @Autowired
    OrderRepository orderRepository;

    @RequestMapping("/")
    public String getAllOrders(Model model){
        List<Orderorder> orderorders = orderRepository.findAll();
        model.addAttribute("orderList", orderorders);
        return "orderorders";
    }
}