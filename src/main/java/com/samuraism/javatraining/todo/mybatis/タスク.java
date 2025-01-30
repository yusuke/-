package com.samuraism.javatraining.todo.mybatis;


@SuppressWarnings("NonAsciiCharacters")
public class タスク {
    
    private Integer id;
    private String やること;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getやること() {
        return やること;
    }

    public void setやること(String やること) {
        this.やること = やること;
    }
}