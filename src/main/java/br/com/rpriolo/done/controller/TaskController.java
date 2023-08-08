package br.com.rpriolo.done.controller;

import br.com.rpriolo.done.domain.TaskCreationData;
import br.com.rpriolo.done.domain.model.Task;
import br.com.rpriolo.done.domain.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public String showAllTasks(Model model) {
        List<Task> allTasks = service.getAllTasks();
        model.addAttribute("allTasks", allTasks);
        return "tasks";
    }

    @GetMapping("/add")
    public String loadTaskForm() {
        return "add";
    }

    @PostMapping
    public String createTask(TaskCreationData taskCreationData) {
        service.createTask(taskCreationData);
        return "redirect:/tasks";
    }

    @DeleteMapping
    public String deleteTask(Long id) {
        service.deleteTaskById(id);
        return "redirect:/tasks";
    }
}
