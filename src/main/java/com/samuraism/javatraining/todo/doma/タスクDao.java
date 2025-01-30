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

    @Sql("""
            INSERT INTO タスク (id, やること
            ) VALUES (
            NEXT VALUE FOR タスク_SEQ,
                /* task.やること */''
            )
            """)
    // 新規追加
    @Insert
    int insert(タスク task);

    @Sql("""
            UPDATE タスク SET やること = /* task.やること */''
            WHERE id = /* task.id */0
            """)
    // 更新
    @Update
    int update(タスク task);

    @SuppressWarnings("UnusedReturnValue")
    @Sql("DELETE FROM タスク WHERE id = /* task.id */0")
    // 削除
    @Delete
    int delete(タスク task);
}