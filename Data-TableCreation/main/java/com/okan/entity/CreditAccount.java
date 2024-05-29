package com.okan.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "CreditAccount")
public class CreditAccount extends Account {

    private BigDecimal creditLimit;

}
