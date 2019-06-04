package com.daxia.eshop.inventory.controller;

import com.daxia.eshop.inventory.model.ProductInventory;
import com.daxia.eshop.inventory.service.ProductInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 10:34
 * @Version 1.0
 */
@RestController
@RequestMapping("productInventory")
public class ProductInventoryController {

    @Autowired
    private ProductInventoryService productInventoryService;

    @RequestMapping("/add")
    public String add(ProductInventory productPrice){
        try {
            productInventoryService.add(productPrice);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/update")
    public String update(ProductInventory productPrice){
        try {
            productInventoryService.update(productPrice);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/delete")
    public String delete(Long id){
        try {
            productInventoryService.delete(id);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/findById")
    public ProductInventory findById(Long id){
        try {
            return productInventoryService.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ProductInventory();
    }
}
