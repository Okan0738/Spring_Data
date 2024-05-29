package com.okan.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "DebitAccounts")
public class DebitAccount extends Account {

    private BigDecimal overdraftFee;


}
