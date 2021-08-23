package com.app.entities.task;

import java.awt.Image;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.app.entities.user.Assignee;
import com.app.enums.Impact;
import com.app.enums.TaskStatus;
import com.app.enums.TaskType;

public class Feature extends Task{

	private final TaskType type = TaskType.FEATURE;
	
	private String summary;
	
	private Impact featureImpact;
	
	
	private final List<TaskStatus> allowedStatus;
	
	{
		allowedStatus = new ArrayList<TaskStatus>(TaskStatus.featureStatus());
	}
	
	public Feature(String title, Assignee assignee, LocalDateTime dueDate, TaskStatus currentStatus, Impact featureImpact, String summary) {
		super(title, assignee, dueDate, currentStatus);
		this.featureImpact = featureImpact;
		this.summary = summary;
		// TODO Auto-generated constructor stub
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Impact getFeatureImpact() {
		return featureImpact;
	}

	public void setFeatureImpact(Impact featureImpact) {
		this.featureImpact = featureImpact;
	}
	
	
	

}
