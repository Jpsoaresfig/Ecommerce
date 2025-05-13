package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}