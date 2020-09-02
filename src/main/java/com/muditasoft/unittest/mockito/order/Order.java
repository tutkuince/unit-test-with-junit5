package com.muditasoft.unittest.mockito.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<String> items = new ArrayList<>();

    Order(List<String> items) {
        this.items.addAll(items);
    }
}
