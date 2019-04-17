package com.patterns;

import com.patterns.notification.Message;
import com.patterns.order.Order;
import com.patterns.order.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1L, OrderStatus.Registered);
        Message message = new Message();

        message.updateOrderStatus(order, order1 -> order, "Email");
        message.updateOrderStatus(order, order1 -> order, "SMS");
        message.updateOrderStatus(order, order1 -> order, "MobileApp");

    }
}
