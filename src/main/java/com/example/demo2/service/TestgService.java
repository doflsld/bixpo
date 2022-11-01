package com.example.demo2.service;

import com.example.demo2.domain.entity.Testg;
import com.example.demo2.domain.entity.Tests;
import com.example.demo2.domain.repository.TestgRepository;
import com.example.demo2.dto.TestgDto;
import com.example.demo2.dto.TestsDto;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TestgService {
    private TestgRepository testgRepository;

    public TestgService(TestgRepository testgRepository){
        this.testgRepository = testgRepository;
    }

    @Transactional
    @Scheduled(cron = "5 * * * * *")
    public TestgDto getTestg(){

        Testg testg = testgRepository.findAllByOrderByIdDesc().get(0);

        TestgDto testgDto = TestgDto.builder()
                .id(testg.getId())
                .co(testg.getCo())
                .h2(testg.getH2())
                .regtime(testg.getRegtime())
                .build();

        return testgDto;
    }

}
