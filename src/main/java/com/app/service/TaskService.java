package com.app.service;

import com.app.entities.requests.CreateTaskRequest;
import com.app.entities.task.Task;

public class TaskService<T extends CreateTaskRequest> {

	private TaskServiceHandler<T> serviceHandler;
	
	
	
	public TaskService(TaskServiceHandler<T> serviceHandler) {
		super();
		this.serviceHandler = serviceHandler;
	}



	public Task createTask(CreateTaskRequest request) {
		return serviceHandler.createTask(request);
	}
	
	
}
