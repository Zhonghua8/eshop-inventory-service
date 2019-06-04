package com.daxia.eshop.inventory.service;

import com.daxia.eshop.inventory.model.ProductInventory;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 10:32
 * @Version 1.0
 */
public interface ProductInventoryService {
    public void add(ProductInventory productInventory);

    public void update(ProductInventory productInventory);

    public void delete(Long id);

    public ProductInventory findById(Long id);
}
