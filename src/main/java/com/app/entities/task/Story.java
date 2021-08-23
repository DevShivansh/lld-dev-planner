package com.app.entities.task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.app.entities.user.Assignee;
import com.app.enums.TaskStatus;
import com.app.enums.TaskType;
import com.app.exceptions.InvalidOperation;


public class Story extends Task{

	private final TaskType type = TaskType.STORY;
	
	private final List<TaskStatus> allowedStatus;
	
	{
		allowedStatus = new ArrayList<TaskStatus>(TaskStatus.storyStatus());
	}
	
	private String summery;
	
	private List<Subtrack> subtracks;
	
	public Story(String title, Assignee assignee, LocalDateTime dueDate, TaskStatus currentStatus, String summery) {
		super(title, assignee, dueDate, currentStatus);
		this.summery = summery;
		subtracks = new ArrayList<Subtrack>();
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
	
	public void addSubTrack(Subtrack subtrack) {
		
		if(this.getCurrentStatus() == TaskStatus.COMPLETED)
			throw new InvalidOperation("Task has already been finished");
		
		subtracks.add(subtrack);
	}
	
	public void removeSubtrack(Subtrack subtrack) {
		subtracks.remove(subtrack);
	}

	public void setSummery(String summery) {
		this.summery = summery;
	}
	
	public String getSummery() {
		return summery;
	}

	@Override
	public String toString() {
		return "Story [type=" + type + ", allowedStatus=" + allowedStatus + ", summery=" + summery + ", subtracks="
				+ subtracks + "]";
	}
	
	
	
}
