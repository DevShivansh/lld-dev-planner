package com.app.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public enum TaskStatus {

	OPEN, IN_PROGRESS, TESTING, DEPLOYED, FIXED, COMPLETED;
	
	static List<TaskStatus> featureStatus = new ArrayList<TaskStatus>(Arrays.asList(OPEN, IN_PROGRESS, TESTING, DEPLOYED));
	
	static List<TaskStatus> bugStatus = new ArrayList<TaskStatus>(Arrays.asList(OPEN, IN_PROGRESS, FIXED));
	
	static List<TaskStatus> storyStatus = new ArrayList<TaskStatus>(Arrays.asList(OPEN, IN_PROGRESS, COMPLETED));
	
	static List<TaskStatus> sprintStatus = new ArrayList<TaskStatus>(Arrays.asList(OPEN, IN_PROGRESS, COMPLETED));
	
	static public List<TaskStatus> featureStatus() {
		return featureStatus;
	}
	
	static public List<TaskStatus> bugStatus() {
		return bugStatus;
	}
	
	static public List<TaskStatus> storyStatus() {
		return storyStatus;
	}
	
	static public List<TaskStatus> sprintStatus() {
		return sprintStatus;
	}
}
