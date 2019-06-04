package com.daxia.eshop.inventory.model;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 10:27
 * @Version 1.0
 */
public class ProductInventory {
    private Long id;
    private Long inventoryNum;
    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(Long inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
