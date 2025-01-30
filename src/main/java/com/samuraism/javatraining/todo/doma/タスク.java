package com.samuraism.javatraining.todo.doma;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Column;

@SuppressWarnings({"NonAsciiCharacters", "unused"})
@Entity(immutable = false) // データを更新可能にする
public class タスク {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "やること")
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