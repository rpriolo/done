package br.com.rpriolo.done.domain.repository;

import br.com.rpriolo.done.domain.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
