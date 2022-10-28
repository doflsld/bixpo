package com.example.demo2.domain.repository;

import com.example.demo2.domain.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Integer>, JpaSpecificationExecutor<Test>{

    public List<Test> findByBoardnumOrderByRegtimeDesc(String boardnum);

}
