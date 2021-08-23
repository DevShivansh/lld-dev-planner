package com.app.entities.task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.app.entities.user.Assignee;
import com.app.enums.Severity;
import com.app.enums.TaskStatus;
import com.app.enums.TaskType;

public class Bug extends Task{

	private final TaskType type = TaskType.BUG;
	
	private final List<TaskStatus> allowedStatus;
	
	private Severity severity;
	
	{
		allowedStatus = new ArrayList<TaskStatus>(TaskStatus.bugStatus());
	}
	
	
	public Bug(String title, Assignee assignee, LocalDateTime dueDate, TaskStatus currentStatus, Severity severity) {
		super(title, assignee, dueDate, currentStatus);
		this.severity = severity;
	}

	@Override
	public TaskType taskType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public List<TaskStatus> allowedStatus() {
		// TODO Auto-generated method stub
		return allowedStatus;
	}
	
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	
	public Severity getSeverity() {
		return severity;
	}

	
}
