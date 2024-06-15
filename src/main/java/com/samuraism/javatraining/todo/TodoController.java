package com.samuraism.javatraining.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@SuppressWarnings("NonAsciiCharacters")
@org.springframework.stereotype.Controller
public class TodoController {

    @Autowired
    TaskRepository repository;

    @GetMapping("/")
    String showTodos(Model model) {
        List<タスク> tasks = repository.findAll();
        model.addAttribute("tasks", tasks);
        return "todo";
    }

    @PostMapping("/addTask")
    String addTask(@RequestParam String やること) {
        タスク task = new タスク();
        task.setやること(やること);
        repository.save(task);
        return "redirect:/";
    }

    @PostMapping("/removeTask")
    String addTask(@RequestParam int id) {
        タスク task = new タスク();
        task.setId(id);
        repository.delete(task);
        return "redirect:/";
    }
}
