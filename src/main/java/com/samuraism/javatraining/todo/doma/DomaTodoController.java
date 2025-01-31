package com.samuraism.javatraining.todo.doma;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@SuppressWarnings("NonAsciiCharacters")
@Controller
public class DomaTodoController {

    private final タスクDao taskDao;

    public DomaTodoController(タスクDao taskDao) {
        this.taskDao = taskDao;
    }

    @GetMapping("/doma/")
    String showTodos(Model model) {
        List<タスク> tasks = taskDao.findAll();
        model.addAttribute("tasks", tasks);
        return "todo";
    }

    @PostMapping("/doma/addTask")
    String addTask(@RequestParam String やること) {
        タスク task = new タスク();
        task.setやること(やること);
        taskDao.insert(task);
        return "redirect:/doma/";
    }

    @PostMapping("/doma/removeTask")
    String addTask(@RequestParam int id) {
        タスク task = new タスク();
        task.setId(id);
        taskDao.delete(task);
        return "redirect:/doma/";
    }
}
