package com.patterns.order;

import com.patterns.notification.ObserverNumber;

public interface ObservableRegister {
    void registerOrder(ObserverNumber observer);
    void unregisterOrder(ObserverNumber observer);
    void notificationObserver();

}
