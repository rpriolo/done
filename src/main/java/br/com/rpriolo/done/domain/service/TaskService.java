package br.com.rpriolo.done.domain.service;

import br.com.rpriolo.done.domain.TaskCreationData;
import br.com.rpriolo.done.domain.model.Task;
import br.com.rpriolo.done.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public void createTask(TaskCreationData taskCreationData) {
        Task task = new Task(taskCreationData);
        repository.save(task);
    }
}
