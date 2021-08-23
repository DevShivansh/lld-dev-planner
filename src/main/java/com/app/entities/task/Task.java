package com.app.entities.task;

import java.time.LocalDateTime;
import java.util.List;

import com.app.entities.Sprint;
import com.app.entities.user.Assignee;
import com.app.enums.TaskStatus;
import com.app.enums.TaskType;
import com.app.exceptions.InvalidOperation;

public abstract class Task {

	private static Integer globalId = 1;
	
	private Integer id;
	
	private String title;
	
	private Assignee assignee;
	
	private LocalDateTime dueDate;
	
	private TaskStatus currentStatus;
	
	private Sprint sprint;
	
	public Task(String title, Assignee assignee, LocalDateTime dueDate, TaskStatus currentStatus) {
		super();
		this.id = globalId++;
		this.title = title;
		this.assignee = assignee;
		this.dueDate = dueDate;
		this.currentStatus = currentStatus;
	}
	
	public Task(String title, Assignee assignee, LocalDateTime dueDate, TaskStatus currentStatus, Sprint sprint) {
		super();
		this.id = globalId++;
		this.title = title;
		this.assignee = assignee;
		this.dueDate = dueDate;
		this.currentStatus = currentStatus;
		this.sprint = sprint;
	}
	
	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
		sprint.addTask(this);
	}
	
	public void unregisterFromSprint(Sprint sprint) {
		if(this.sprint == null)
			throw new InvalidOperation("Task not registered with any sprint");
		this.sprint.removeTask(this);
		this.sprint = null;
	}

	public abstract TaskType taskType();
	
	public abstract List<TaskStatus> allowedStatus();


	
	public Integer getId() {
		return id;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Assignee getAssignee() {
		return assignee;
	}

	public void setAssignee(Assignee assignee) {
		this.assignee = assignee;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	
	
	public TaskStatus getCurrentStatus() {
		return currentStatus;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", assignee=" + assignee + ", dueDate=" + dueDate
				+ ", currentStatus=" + currentStatus + ", sprint=" + sprint + "]";
	}
	
	
	
	
	
}
