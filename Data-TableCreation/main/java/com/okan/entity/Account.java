package com.okan.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@MappedSuperclass
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;

}
