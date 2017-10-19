package com.gohealth.SpringToDo.controllers;

import com.gohealth.SpringToDo.Task;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author <a href="mailto:cmullikin@gohealth.com">Colin Mullikin</a>
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final Map<String, Task> tasks = new LinkedHashMap<>();

    @RequestMapping("/{name}")
    public Task getTask(@PathVariable String name) {
        Task existingTask = tasks.get(name);
        if (existingTask != null) {
            return existingTask;
        }
        Task newTask = new Task(name);
        tasks.put(name, newTask);
        return newTask;
    }

    @RequestMapping("/all")
    public Collection<Task> getAllTasks(){
        return tasks.values();
    }

}
