package com.app.entities.task;

import java.util.ArrayList;
import java.util.List;

import com.app.enums.TaskStatus;


public class Subtrack {
	
	private Story parentStory;
	
	private String title;
	
	private TaskStatus currentStatus;
	
	
	
	public Subtrack(Story parentStory, String title, TaskStatus currentStatus) {
		super();
		this.parentStory = parentStory;
		this.title = title;
		this.currentStatus = currentStatus;
		this.parentStory.addSubTrack(this);
	}



	public List<TaskStatus> getAllowedStatus(){
		return parentStory.allowedStatus();
	}



	public Story getParentStory() {
		return parentStory;
	}



	public void setParentStory(Story parentStory) {
		this.parentStory = parentStory;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public TaskStatus getCurrentStatus() {
		return currentStatus;
	}



	public void setCurrentStatus(TaskStatus currentStatus) {
		this.currentStatus = currentStatus;
	}
	
	
	

}
