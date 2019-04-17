package com.patterns.notification;

import com.patterns.order.Order;
import com.patterns.order.OrderStatus;

@FunctionalInterface
public interface ObserverStatus {
    OrderStatus ststus(Order order);
}
