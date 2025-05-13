package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}