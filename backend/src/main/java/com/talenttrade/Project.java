package com.talenttrade;
import jakarta.persistence.*;
@Entity @Table(name="projects") public class Project { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; public String title; @Column(length=3000) public String description; public String requiredSkills; public Double budget; public String deadline; public String type; public String status; public String client; public String freelancer; }
