package com.app.entities.requests;

import java.time.LocalDateTime;

import com.app.enums.Severity;
import com.app.enums.TaskStatus;
import com.app.enums.TaskType;

public class CreateBugTaskRequest extends CreateTaskRequest {

	private Severity severity;
	
	public CreateBugTaskRequest(String title, String assignee, LocalDateTime dueDate,
			TaskStatus status, Severity severity) {
		super(title, assignee, TaskType.BUG, dueDate, status);
		this.severity = severity;
	}

	
	public Severity getSeverity() {
		return severity;
	}
	
}
