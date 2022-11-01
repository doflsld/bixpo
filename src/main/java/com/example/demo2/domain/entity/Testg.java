package com.example.demo2.domain.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="srcb00005_t")
public class Testg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private Float co;

    @Column
    private Float h2;

    @Column
    private Date regtime;

    @Builder
    public Testg(Long id, Float co, Float h2, Date regtime){
        this.id = id;
        this.co = co;
        this.h2 = h2;
        this.regtime = regtime;
    }

}
