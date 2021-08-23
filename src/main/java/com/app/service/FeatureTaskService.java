package com.app.service;

import java.time.LocalDateTime;

import com.app.entities.requests.CreateFeatureTaskRequest;
import com.app.entities.requests.CreateStoryTaskRequest;
import com.app.entities.requests.CreateTaskRequest;
import com.app.entities.task.Feature;
import com.app.entities.task.Story;
import com.app.entities.task.Task;
import com.app.entities.user.Assignee;
import com.app.enums.Impact;
import com.app.enums.TaskStatus;
import com.app.repository.FeatureRepository;
import com.app.repository.StoryRepository;

public class FeatureTaskService implements TaskServiceHandler<CreateFeatureTaskRequest>{

	private FeatureRepository repository;
	
	
	
	public FeatureTaskService(FeatureRepository repository) {
		super();
		this.repository = repository;
	}



	@Override
	public Task createTask(CreateTaskRequest request) {
		CreateFeatureTaskRequest featureRequest = (CreateFeatureTaskRequest) request;
		Feature newStory = new Feature(featureRequest.getTitle(), new Assignee(request.getAssignee()),
				featureRequest.getDueDate(),
				featureRequest.getStatus(), featureRequest.getFeatureImpact(), featureRequest.getSummary());
		repository.put(newStory.getId(), newStory);
		return newStory;
	}

}
