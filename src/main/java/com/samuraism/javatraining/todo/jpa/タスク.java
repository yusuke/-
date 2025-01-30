package com.samuraism.javatraining.todo.jpa;

import jakarta.persistence.*;

@SuppressWarnings("NonAsciiCharacters")
@Entity
@Table(name = "タスク")
public class タスク {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    public void setやること(String firstName) {
        this.やること = firstName;
    }
}