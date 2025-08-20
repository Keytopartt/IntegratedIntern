
package com.internalweb.controller;

import com.internalweb.model.Order;
import com.internalweb.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public String listOrders(Model model) {
        model.addAttribute("orders", orderRepository.findAll());
        return "orders";
    }

    @PostMapping("/orders/add")
    public String addOrder(
        @RequestParam String date,
        @RequestParam(required = false) Long id,
        @RequestParam String name,
        @RequestParam Double price,
        @RequestParam Integer quantity
    ) {
        Double total = price * quantity;
        Order order = new Order(id, "", "", false, date, name, price, quantity, total);
        orderRepository.save(order);
        return "redirect:/orders";
    }
}
