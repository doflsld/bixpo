package com.example.demo2.domain.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String boardnum;

    @Column
    private Float senstemp;

    @Column
    private Float senshumi;

    @Column
    private Timestamp regtime;

    @Builder
    public Test(Integer id, String boardnum, Float senstemp, Float senshumi, Timestamp regtime){
        this.id = id;
        this.boardnum = boardnum;
        this.senstemp = senstemp;
        this.senshumi = senshumi;
        this.regtime = regtime;
    }

}
