package com.example.demo2.service;

import com.example.demo2.domain.entity.Tests;
import com.example.demo2.domain.repository.TestsRepository;
import com.example.demo2.dto.TestsDto;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TestsService {
    private TestsRepository testsRepository;

    public TestsService(TestsRepository testsRepository){
        this.testsRepository = testsRepository;
    }

    @Transactional
    @Scheduled(cron = "5 * * * * *")
    public TestsDto getTests(){

        Tests tests = testsRepository.findAllByOrderByIdDesc().get(0);

        TestsDto testsDto = TestsDto.builder()
                .id(tests.getId())
                .temp(tests.getTemp())
                .humi(tests.getHumi())
                .regtime(tests.getRegtime())
                .build();

        return testsDto;
    }

}
