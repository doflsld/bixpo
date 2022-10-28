package com.example.demo2.dto;

import com.example.demo2.domain.entity.Test;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TestDto {
    private Integer id;
    private String boardnum;
    private Float senstemp;
    private Float senshumi;
    private Timestamp regtime;

    public Test toEntity(){
        Test build = Test.builder()
                .id(id)
                .boardnum(boardnum)
                .senstemp(senstemp)
                .senshumi(senshumi)
                .regtime(regtime)
                .build();
        return build;
    }

    @Builder
    public TestDto(Integer id, String boardnum, Float senstemp, Float senshumi, Timestamp regtime){
        this.id = id;
        this.boardnum = boardnum;
        this.senstemp = senstemp;
        this.senshumi = senshumi;
        this.regtime = regtime;
    }

}
