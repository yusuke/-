package com.samuraism.javatraining.todo.mybatis;

import org.apache.ibatis.annotations.*;

import java.util.List;

@SuppressWarnings("NonAsciiCharacters")
public interface タスクMapper {
    @Select("SELECT * FROM タスク WHERE id = #{id}")
    タスク selectタスクById(@Param("id") Integer id);

    @Insert("INSERT INTO タスク (id, やること) VALUES (NEXT VALUE FOR タスク_SEQ, #{やること})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertタスク(タスク task);

    @Update("UPDATE タスク SET やること = #{やること} WHERE id = #{id}")
    void updateタスク(タスク task);

    @Delete("DELETE FROM タスク WHERE id = #{id}")
    void deleteタスク(@Param("id") Integer id);

    @Select("SELECT * FROM タスク")
    List<タスク> selectAllタスク();
}