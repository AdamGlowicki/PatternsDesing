package com.patterns.order;

import com.patterns.notification.ObserverNumber;

import java.util.HashSet;
import java.util.Set;

public class Order implements ObservableRegister {

    private Long orderNumber;
    private OrderStatus orderStatus;

    private Set<Order> orders = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void unregisterOrder(Order order) {
        orders.remove(order);
    }

    @Override
    public void notificationObserver() {
        registeredObservers.stream()
                .peek(observer -> observer.update(this));
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notificationObserver();
    }
}
