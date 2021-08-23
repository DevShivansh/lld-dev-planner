package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.entities.requests.CreateBugTaskRequest;
import com.app.entities.requests.CreateFeatureTaskRequest;
import com.app.entities.requests.CreateStoryTaskRequest;
import com.app.entities.task.Task;
import com.app.service.TaskService;

@Component
public class TaskRunner {

	
	@Autowired
	@Qualifier("storyTaskService")
	public TaskService<CreateStoryTaskRequest> storyTaskService;
	
	@Qualifier("featureTaskService")
	public TaskService<CreateFeatureTaskRequest> featureTaskService;
	
	@Qualifier("bugTaskService")
	public TaskService<CreateBugTaskRequest> bugTaskService;
	
	
	public Task createStoryTask(CreateStoryTaskRequest request) {
		
		return storyTaskService.createTask(request);
		
	}
	
	
	
}
