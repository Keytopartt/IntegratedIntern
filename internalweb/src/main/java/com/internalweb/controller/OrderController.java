package com.internalweb.controller;

import com.internalweb.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@Controller
public class OrderController {
    private List<Order> orders = new ArrayList<>();

    @GetMapping("/orders")
    public String listOrders(Model model) {
        model.addAttribute("orders", orders);
        return "orders";
    }

    @PostMapping("/orders/add")
    public String addOrder(
        @RequestParam String date,
        @RequestParam Long id,
        @RequestParam String name,
        @RequestParam Double price,
        @RequestParam Integer quantity
    ) {
        Double total = price * quantity;
        Order order = new Order(id, "", "", false, date, name, price, quantity, total);
        orders.add(order);
        return "redirect:/orders";
    }
}
