package com.example.demo2.service;

import com.example.demo2.domain.entity.Test;
import com.example.demo2.domain.repository.TestRepository;
import com.example.demo2.dto.TestDto;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TestService {
    private TestRepository testRepository;

    public TestService(TestRepository testRepository){
        this.testRepository = testRepository;
    }

//    @Transactional
//    public List<TestDto> getTestList(String boardnum){
//        boardnum = "1";
//        List<Test> testList = testRepository.findByBoardnum(boardnum);
//        List<TestDto> testDtoList = new ArrayList<>();
//
//            for (Test test : testList) {
//                TestDto testDto = TestDto.builder()
//                        .id(test.getId())
//                        .boardnum(test.getBoardnum())
//                        .senstemp(test.getSenstemp())
//                        .senshumi(test.getSenshumi())
//                        .build();
//                testDtoList.add(testDto);
//            }
//        return testDtoList;
//    }

    @Transactional
    @Scheduled(cron = "5 * * * * *")
    public TestDto getTest(){
        String boardnum = "1";
        Test test = testRepository.findByBoardnumOrderByRegtimeDesc(boardnum).get(0);

        TestDto testDto = TestDto.builder()
                .id(test.getId())
                .boardnum(test.getBoardnum())
                .senstemp(test.getSenstemp())
                .senshumi(test.getSenshumi())
                .regtime(test.getRegtime())
                .build();

        return testDto;

    }

}
