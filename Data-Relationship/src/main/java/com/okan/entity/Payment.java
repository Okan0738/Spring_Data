package com.okan.entity;

import com.okan.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "DATE")
    private LocalDateTime createDate;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status status;

   // @OneToOne(cascade = CascadeType.ALL)
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "payment_detail_id")
    private PaymentDetail paymentDetail;

    @ManyToOne
    private Merchant merchant;


    public Payment(LocalDateTime createDate, BigDecimal amount, Status status) {
        this.createDate = createDate;
        this.amount = amount;
        this.status = status;
    }
}
