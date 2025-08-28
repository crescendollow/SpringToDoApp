package com.app.SpringToDoApp.repository;

import com.app.SpringToDoApp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
