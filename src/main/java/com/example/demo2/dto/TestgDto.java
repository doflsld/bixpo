package com.example.demo2.dto;

import com.example.demo2.domain.entity.Testg;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TestgDto {
    private Long id;
    private Float co;
    private Float h2;
    private Date regtime;

    public Testg toEntity(){
        Testg build = Testg.builder()
                .id(id)
                .co(co)
                .h2(h2)
                .regtime(regtime)
                .build();
        return build;
    }

    @Builder
    public TestgDto(Long id, Float co, Float h2, Date regtime){
        this.id = id;
        this.co = co;
        this.h2 = h2;
        this.regtime = regtime;
    }

}
