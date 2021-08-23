package com.app.entities.requests;

import java.time.LocalDateTime;

import com.app.enums.TaskStatus;
import com.app.enums.TaskType;

public class CreateStoryTaskRequest extends CreateTaskRequest {

	private String summary;
	
	public CreateStoryTaskRequest(String title, String assignee, LocalDateTime dueDate,
			TaskStatus status, String summary) {
		super(title, assignee, TaskType.STORY, dueDate, status);
		this.summary = summary;
	}

	public String getSummary() {
		return summary;
	}
	
}
