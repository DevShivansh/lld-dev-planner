package com.app.service;

import com.app.entities.requests.CreateStoryTaskRequest;
import com.app.entities.requests.CreateTaskRequest;
import com.app.entities.task.Story;
import com.app.entities.task.Task;
import com.app.entities.user.Assignee;
import com.app.repository.StoryRepository;

public class StoryTaskService implements TaskServiceHandler<CreateStoryTaskRequest>{

	private StoryRepository repository;
	
	
	
	public StoryTaskService(StoryRepository repository) {
		super();
		this.repository = repository;
	}



	@Override
	public Task createTask(CreateTaskRequest request) {
		CreateStoryTaskRequest storyRequest = (CreateStoryTaskRequest) request;
		Story newStory = new Story(storyRequest.getTitle(), new Assignee(request.getAssignee()), storyRequest.getDueDate(),
				storyRequest.getStatus(), storyRequest.getSummary());
		repository.put(newStory.getId(), newStory);
		return newStory;
	}

}
