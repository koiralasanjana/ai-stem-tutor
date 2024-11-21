package com.herpath.ai_stem_tutor.repository;

import com.herpath.ai_stem_tutor.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    // Additional query methods if needed
}
