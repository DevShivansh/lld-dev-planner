package com.app.entities.requests;

import java.time.LocalDateTime;

import com.app.enums.TaskStatus;
import com.app.enums.TaskType;

public class CreateSubtractTaskRequest {

	private Integer parentTask;
	
	private String title;
	
	private TaskStatus currentStatus;
	
	
	public CreateSubtractTaskRequest(String title,
			TaskStatus status, Integer parentTask) {
		this.parentTask = parentTask;
		this.title = title;
		this.currentStatus = currentStatus;
	}

	public Integer getParentTask() {
		return parentTask;
	}
	
	public TaskStatus getCurrentStatus() {
		return currentStatus;
	}
	
	public String getTitle() {
		return title;
	}
}
