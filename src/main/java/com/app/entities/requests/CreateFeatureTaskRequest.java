package com.app.entities.requests;

import java.time.LocalDateTime;

import com.app.enums.Impact;
import com.app.enums.TaskStatus;
import com.app.enums.TaskType;

public class CreateFeatureTaskRequest extends CreateTaskRequest {

	private String summary;
	
	private Impact featureImpact;
	
	
	public CreateFeatureTaskRequest(String title, String assignee, LocalDateTime dueDate,
			TaskStatus status, String summary, Impact featureImpact) {
		super(title, assignee, TaskType.FEATURE, dueDate, status);
		this.summary = summary;
		this.featureImpact = featureImpact;
	}

	
	public String getSummary() {
		return summary;
	}
	
	public Impact getFeatureImpact() {
		return featureImpact;
	}
	
}
