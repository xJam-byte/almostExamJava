package com.example.almostexam.repositories;

import com.example.almostexam.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
    Diary findByTitle(String title);
}
