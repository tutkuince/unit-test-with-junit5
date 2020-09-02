package com.muditasoft.unittest.mockito.order;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;

public class SampleMockWithCustomerOrderTest {

    @Test
    void add_order_to_customer() {
        final Inventory inventoryMock = Mockito.mock(Inventory.class);
        Mockito.when(inventoryMock.isStockAvailable("Item1", "Item2")).thenReturn(true);
        Mockito.when(inventoryMock.isStockAvailable("Item3")).thenReturn(false);

        Customer customer = new Customer(inventoryMock);
        assertTrue(customer.addOrder(new Order(List.of("Item1", "Item2"))));
        assertFalse(customer.addOrder(new Order(List.of("Item3"))));

        Mockito.verify(inventoryMock, Mockito.times(1))
                .isStockAvailable(eq("Item1"), eq("Item2"));
        Mockito.verify(inventoryMock, Mockito.times(1))
                .isStockAvailable(eq("Item3"));

    }
}
