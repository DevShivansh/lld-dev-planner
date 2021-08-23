package com.app.entities.requests;

import java.time.LocalDateTime;

import com.app.enums.TaskStatus;
import com.app.enums.TaskType;

public class CreateTaskRequest {

	private String title;
	
	private String assignee;
	
	private TaskType taskType;
	
	private LocalDateTime dueDate;
	
	private TaskStatus status;

	public CreateTaskRequest(String title, String assignee, TaskType taskType, LocalDateTime dueDate,
			TaskStatus status) {
		super();
		this.title = title;
		this.assignee = assignee;
		this.taskType = taskType;
		this.dueDate = dueDate;
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public String getAssignee() {
		return assignee;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public TaskStatus getStatus() {
		return status;
	}
	
	
	
}
