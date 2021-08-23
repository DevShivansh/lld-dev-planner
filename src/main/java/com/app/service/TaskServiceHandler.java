package com.app.service;

import com.app.entities.requests.CreateTaskRequest;
import com.app.entities.task.Task;

public interface TaskServiceHandler<T extends CreateTaskRequest> {

	public Task createTask(CreateTaskRequest request);
}
