package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.entities.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {}