package com.example.erfan_adine_ptest.dto.in.user;


import com.example.erfan_adine_ptest.dto.core.BasePersonDto;
import com.example.erfan_adine_ptest.entity.product.MainOrder;
import com.example.erfan_adine_ptest.entity.work.MainService;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Lob;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerInDto extends BasePersonDto {

    private MainOrder order;

    @Lob
    private byte[] image;


    Set<MainService> mainServiceList;
}
