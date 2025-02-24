package com.samuraism.javatraining.todo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("NonAsciiCharacters")
@Repository
public interface タスクRepository extends JpaRepository<タスク, Integer> {
    List<タスク> findAll();
}
