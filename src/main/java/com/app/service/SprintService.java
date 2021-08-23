package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Sprint;
import com.app.entities.task.Task;
import com.app.exceptions.InvalidOperation;
import com.app.repository.SprintRepository;
import com.app.repository.TaskRepository;

@Service
public class SprintService {
	
	
	@Autowired
	private SprintRepository repository;

	@Autowired
	private TaskRepository taskRepository; 
	
	public Sprint createSprint(String sprintName) {
		
		Sprint sprint = new Sprint(sprintName);
		
		repository.put(sprint.getId(), sprint);
		
		return sprint;
		
	}
	
	public void addTasks(Integer sprintId, Integer taskId) {
		
		Task task = taskRepository.get(taskId);
		
		if(task == null)
			throw new InvalidOperation(null);
			
		//	task is 
		
		// 
	}
	
}
