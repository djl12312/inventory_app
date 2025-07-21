package com.lion.inventory_app.repository;


import com.lion.inventory_app.model.Product;
import com.lion.inventory_app.model.Stock;
import com.lion.inventory_app.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface StockRepository extends JpaRepository <Stock, Long>, QuerydslPredicateExecutor<Stock> {
    Optional<Stock> findByProductIdAndWarehouseId(Long productId, Long warehouseId);

}
