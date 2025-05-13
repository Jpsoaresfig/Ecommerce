package com.jp.ecommerce.entities;
import java.time.LocalDateTime;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "app_user") 
@Data
public class User {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user")
    private List<Address> addresses;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
    
    @OneToMany(mappedBy = "user")
    private List<Cart> carts;

  
}
