package com.example.demo2.domain.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="srcb00004_t")
public class Tests {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private Float temp;

    @Column
    private Float humi;

    @Column
    private Date regtime;

    @Builder
    public Tests(Long id, Float temp, Float humi, Date regtime){
        this.id = id;
        this.temp = temp;
        this.humi = humi;
        this.regtime = regtime;
    }

}
