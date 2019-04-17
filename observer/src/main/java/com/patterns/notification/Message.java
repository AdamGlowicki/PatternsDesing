package com.patterns.notification;

import com.patterns.order.Order;
import com.patterns.order.OrderStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Message {

    public static final Logger LOG = LoggerFactory.getLogger(Message.class);

    public void updateOrderStatus(Order order,
                                  ObserverNumber number,
                                  ObserverStatus ststus,
                                  String massageApproach) {
        Long orderNumber = number.number(order);
        OrderStatus orderStatus = ststus.ststus(order);
        System.out.println(massageApproach + " Order number: %s, changed status to: %s."+
                orderNumber +
                orderStatus);
    }
}
