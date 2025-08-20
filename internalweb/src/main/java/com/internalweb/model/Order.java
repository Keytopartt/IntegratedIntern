
package com.internalweb.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String details;
    private boolean fulfilled;

    private String date;
    private String name;
    private Double price;
    private Integer quantity;
    private Double total;

    public Order() {}

    public Order(Long id, String customerName, String details) {
        this.id = id;
        this.customerName = customerName;
        this.details = details;
        this.fulfilled = false;
    }

    public Order(Long id, String customerName, String details, boolean fulfilled, String date, String name, Double price, Integer quantity, Double total) {
        this.id = id;
        this.customerName = customerName;
        this.details = details;
        this.fulfilled = fulfilled;
        this.date = date;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
    public boolean isFulfilled() { return fulfilled; }
    public void setFulfilled(boolean fulfilled) { this.fulfilled = fulfilled; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}
