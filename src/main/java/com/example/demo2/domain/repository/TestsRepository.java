package com.example.demo2.domain.repository;

import com.example.demo2.domain.entity.Tests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.sql.Timestamp;
import java.util.List;

public interface TestsRepository extends JpaRepository<Tests, Long>, JpaSpecificationExecutor<Tests>{

    List<Tests> findAllByOrderByIdDesc();

}
