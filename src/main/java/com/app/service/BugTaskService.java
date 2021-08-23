package com.app.service;

import com.app.entities.requests.CreateBugTaskRequest;
import com.app.entities.requests.CreateStoryTaskRequest;
import com.app.entities.requests.CreateTaskRequest;
import com.app.entities.task.Bug;
import com.app.entities.task.Story;
import com.app.entities.task.Task;
import com.app.entities.user.Assignee;
import com.app.repository.BugRepository;
import com.app.repository.StoryRepository;

public class BugTaskService implements TaskServiceHandler<CreateBugTaskRequest>{

	private BugRepository repository;
	
	
	
	public BugTaskService(BugRepository repository) {
		super();
		this.repository = repository;
	}



	@Override
	public Task createTask(CreateTaskRequest request) {
		CreateBugTaskRequest bugRequest = (CreateBugTaskRequest) request;
		Bug newBug = new Bug(bugRequest.getTitle(), new Assignee(request.getAssignee()), bugRequest.getDueDate(),
				bugRequest.getStatus(), bugRequest.getSeverity());
		repository.put(newBug.getId(), newBug);
		return newBug;
	}

}
