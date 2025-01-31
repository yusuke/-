package com.samuraism.javatraining.todo.doma;

import org.seasar.doma.*;

import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@SuppressWarnings("NonAsciiCharacters")
@Dao
@ConfigAutowireable 
public interface タスクDao {

    @Sql("SELECT * FROM タスク WHERE id = /* id */0")
    // 主キーで1件取得
    @Select
    タスク findById(Integer id);

    @Sql("SELECT * FROM タスク ORDER BY id")
    // 全件取得
    @Select
    List<タスク> findAll();

    // 新規追加
    @Insert
    int insert(タスク task);

    // 更新
    @Update
    int update(タスク task);

    @SuppressWarnings("UnusedReturnValue")
    // 削除
    @Delete
    int delete(タスク task);
}