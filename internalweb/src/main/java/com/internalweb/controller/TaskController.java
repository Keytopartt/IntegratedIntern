package com.internalweb.controller;

import com.internalweb.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@Controller
public class TaskController {
    private List<Task> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public String listTasks(Model model) {
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping("/tasks/add")
    public String addTask(@RequestParam String description, @RequestParam String assignedTo) {
        Task task = new Task((long) (tasks.size() + 1), description, assignedTo);
        tasks.add(task);
        return "redirect:/tasks";
    }
}
