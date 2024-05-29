package com.okan.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "paymentDetails")
public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private BigDecimal merchantPayoutAmount;
    private BigDecimal commissionAmount;
    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    @OneToOne(mappedBy = "paymentDetail")
    private Payment payment;

    public PaymentDetail(BigDecimal merchantPayoutAmount, BigDecimal commissionAmount, LocalDate payoutDate) {
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.commissionAmount = commissionAmount;
        this.payoutDate = payoutDate;
    }
}

