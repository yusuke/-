package com.samuraism.javatraining.todo.mybatis;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@SuppressWarnings("NonAsciiCharacters")
@org.springframework.stereotype.Controller
public class MyBatisTodoController {

    private final タスクMapper taskMapper;

    public MyBatisTodoController(タスクMapper taskMapper
    ) {
        this.taskMapper = taskMapper;
    }

    @GetMapping("/mybatis/")
    String showTodos(Model model) {
        List<MyBatisタスク> tasks = taskMapper.selectAllタスク();
        model.addAttribute("tasks", tasks);
        return "todo";
    }

    @PostMapping("/mybatis/addTask")
    String addTask(@RequestParam String やること) {
        MyBatisタスク task = new MyBatisタスク();
        task.setやること(やること);
        taskMapper.insertタスク(task);
        return "redirect:/mybatis/";
    }

    @PostMapping("/mybatis/removeTask")
    String addTask(@RequestParam int id) {
        MyBatisタスク task = new MyBatisタスク();
        task.setId(id);
        taskMapper.deleteタスク(task.getId());
        return "redirect:/mybatis/";
    }
}
