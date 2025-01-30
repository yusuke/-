package com.samuraism.javatraining.todo.doma;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings({"NonAsciiCharacters", "unused"})
@Service
public class タスクService {

    private final タスクDao タスクDao;

    public タスクService(タスクDao タスクDao) {
        this.タスクDao = タスクDao;
    }

    // すべてのタスクを取得
    public List<タスク> getAllTasks() {
        return タスクDao.findAll();
    }

    // IDでタスクを取得
    public タスク getTaskById(Integer id) {
        return タスクDao.findById(id);
    }

    // 新しいタスクの作成
    @Transactional
    public void addTask(タスク task) {
        タスクDao.insert(task);
    }

    // タスクを更新
    @Transactional
    public void updateTask(タスク task) {
        タスクDao.update(task);
    }

    // タスクを削除
    @Transactional
    public void deleteTask(タスク task) {
        タスクDao.delete(task);
    }
}