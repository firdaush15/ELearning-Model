package com.hijabshop.entities;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface InventoryFacadeRemote {

    // Existing Product methods
    HijabProduct[] getAllProducts() throws InventoryException;

    HijabProduct getProduct(String sku) throws InventoryException;

    void addProduct(HijabProduct product) throws InventoryException;

    // Existing Customer methods
    void registerCustomer(CustomerProfile customer) throws InventoryException;

    CustomerProfile loginCustomer(String email, String password) throws InventoryException;

    // --- NEW: Order Management Methods ---
    void createOrder(CustomerOrder order) throws InventoryException;

    List<CustomerOrder> getAllOrders() throws InventoryException;

    double getTotalRevenue() throws InventoryException;
}
