package com.daxia.eshop.inventory.mapper;

import com.daxia.eshop.inventory.model.ProductInventory;
import org.apache.ibatis.annotations.*;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 10:30
 * @Version 1.0
 */

@Mapper
public interface ProductInventoryMapper {

    @Insert("insert into product_inventory (inventory_num, product_id) values (#{inventoryNum},#{productId})")
    public void add(ProductInventory productInventory);

    @Update("update product_inventory set inventory_num = #{inventoryNum}, product_id = #{productId} where id = #{id}")
    public void update(ProductInventory productInventory);

    @Delete("delete from product_inventory where id = #{id}")
    public void delete(@Param("id") Long id);

    @Select("select * from product_inventory where id = #{id}")
    public ProductInventory findById(@Param("id") Long id);

    @Select("select * from product_inventory where product_id = #{productId}")
    public ProductInventory findByProductId(@Param("productId") Long productId);
}
