package com.example.erfan_adine_ptest.entity.user;


import com.example.erfan_adine_ptest.entity.core.BasePerson;
import com.example.erfan_adine_ptest.entity.product.MainOrder;
import com.example.erfan_adine_ptest.entity.work.MainService;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Worker extends BasePerson {


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_ID_mo")
    private MainOrder order;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "mainService_ID_mm_l")
    private Set<MainService> mainService;

    @Lob
    private byte[] image;

    private BigDecimal accountBalance;

    private BigDecimal debtToTheCompany;
}
