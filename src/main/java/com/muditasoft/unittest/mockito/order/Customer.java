package com.muditasoft.unittest.mockito.order;

public class Customer {
    final Inventory inventory;

    public Customer(Inventory inventory) {
        this.inventory = inventory;
    }

    boolean addOrder(Order order) {
        if (!inventory.isStockAvailable(order.items.toArray(new String[]{}))) {
            return false;
        }
        return true;
    }
}
