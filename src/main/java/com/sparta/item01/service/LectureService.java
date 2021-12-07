package com.sparta.item01.service;

import com.sparta.item01.domain.Lecture;
import com.sparta.item01.domain.LectureRepository;
import com.sparta.item01.dto.LectureRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service // 스프링에게 이 클래스는 서비스임을 명시
public class LectureService {

    // final: 서비스에게 꼭 필요한 녀석임을 명시
    private final LectureRepository lectureRepository;


    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public Long update(Long id, LectureRequestDto requestDto) {
        Lecture lecture1 = lectureRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        lecture1.update(requestDto);
        return lecture1.getId();
    }
}