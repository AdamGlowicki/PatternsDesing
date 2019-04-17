package com.patterns.notification;

import com.patterns.order.Order;

@FunctionalInterface
public interface ObserverNumber {
    Long number(Order order);
}
