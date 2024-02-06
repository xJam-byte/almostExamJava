package com.example.almostexam.services;

import com.example.almostexam.dto.DiaryDto;
import com.example.almostexam.entity.Diary;
import com.example.almostexam.repositories.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DiaryService {
    private DiaryRepository diaryRepository;

    @Autowired
    public DiaryService(DiaryRepository rR){
        this.diaryRepository = rR;
    }

}
