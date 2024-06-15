package com.samuraism.javatraining.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("NonAsciiCharacters")
@Repository
public interface TaskRepository extends JpaRepository<タスク, Integer> {
    List<タスク> findAll();
}
