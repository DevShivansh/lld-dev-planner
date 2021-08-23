package com.app.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.app.entities.task.Story;
import com.app.entities.task.Task;

@Repository
public class TaskRepository extends HashMap<Integer, Task>{

}
