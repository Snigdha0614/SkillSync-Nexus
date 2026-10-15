package com.talenttrade;
import jakarta.persistence.*;
@Entity @Table(name="services") public class Service { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; public String title; @Column(length=2000) public String description; public String category; public String skills; public Double price; public Integer deliveryDays; public String freelancer; }
