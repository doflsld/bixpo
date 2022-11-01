package com.example.demo2.domain.repository;

import com.example.demo2.domain.entity.Testg;
import com.example.demo2.domain.entity.Tests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TestgRepository extends JpaRepository<Testg, Long>, JpaSpecificationExecutor<Testg>{

    List<Testg> findAllByOrderByIdDesc();

}
