package com.app.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.app.entities.task.Task;
import com.app.enums.TaskStatus;
import com.app.exceptions.InvalidOperation;

/*
 * Sprint: A sprint is defined as a collection of tasks used to track progress.
 *  One task can be a part of only one sprint. Once the sprint is completed,
 *   we should not be able to add tasks in the sprint. A Sprint can have following details. 
1. Name 
2. Start Date 
3. End Date 
4. Allowed Status (Open, In Progress, Completed)

 */
public class Sprint {

	private static Integer globalId = 1;
	
	private Integer id;
	
	private String name;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private List<Task> sprintTasks;
	
	private final List<TaskStatus> allowedStatus;
	
	private TaskStatus currentStatus;
	
	{
		allowedStatus = new ArrayList<TaskStatus>(TaskStatus.sprintStatus());
	}

	public Sprint(String name, LocalDateTime startDate, LocalDateTime endDate) {
		super();
		this.id = globalId++;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		currentStatus = TaskStatus.OPEN;
		sprintTasks = new ArrayList<Task>();
	}
	
	public Sprint(String sprintName) {
		this.name = sprintName;
	}

	public void addTask(Task task) {
		if(currentStatus == TaskStatus.COMPLETED)
			throw new InvalidOperation("Sprint already completed!");
		
		sprintTasks.add(task);
	}
	
	public void removeTask(Task task) {
		sprintTasks.remove(task);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public TaskStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(TaskStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Integer getId() {
		return id;
	}

	public List<TaskStatus> getAllowedStatus() {
		return allowedStatus;
	}
	
	
	
	
	
	
	
}
