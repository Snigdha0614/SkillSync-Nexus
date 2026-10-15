package com.talenttrade;
import jakarta.persistence.*;
@Entity @Table(name="users") public class User { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; public String name; @Column(unique=true) public String email; public String role; public String skills; public String bio; }
