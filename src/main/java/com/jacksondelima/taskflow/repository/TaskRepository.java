package com.jacksondelima.taskflow.repository;

import com.jacksondelima.taskflow.entity.Task;
import com.jacksondelima.taskflow.entity.User;
import com.jacksondelima.taskflow.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
    List<Task> findByUserAndStatus(User user, TaskStatus status);
    List<Task> findByStatus(TaskStatus status);
}