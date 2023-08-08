package br.com.rpriolo.done.domain.service;

import br.com.rpriolo.done.domain.TaskCreationData;
import br.com.rpriolo.done.domain.model.Task;
import br.com.rpriolo.done.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public void createTask(TaskCreationData taskCreationData) {
        Task task = new Task(taskCreationData);
        repository.save(task);
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public void deleteTaskById(Long id) {
        repository.deleteById(id);
    }

    public Task getTaskById(Long id) {
        return repository.getReferenceById(id);
    }

    public void updateTask(Long id, TaskCreationData taskCreationData) {
        Task task = repository.getReferenceById(id);
        task.editTask(taskCreationData);
        repository.save(task);
    }
}
