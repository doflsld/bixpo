package com.example.demo2.dto;

import com.example.demo2.domain.entity.Tests;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TestsDto {
    private Long id;
    private Float temp;
    private Float humi;
    private Date regtime;

    public Tests toEntity(){
        Tests build = Tests.builder()
                .id(id)
                .temp(temp)
                .humi(humi)
                .regtime(regtime)
                .build();
        return build;
    }

    @Builder
    public TestsDto(Long id, Float temp, Float humi, Date regtime){
        this.id = id;
        this.temp = temp;
        this.humi = humi;
        this.regtime = regtime;
    }

}
