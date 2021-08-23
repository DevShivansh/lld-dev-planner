package com.app.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.entities.requests.CreateBugTaskRequest;
import com.app.entities.requests.CreateFeatureTaskRequest;
import com.app.entities.requests.CreateStoryTaskRequest;
import com.app.repository.BugRepository;
import com.app.repository.FeatureRepository;
import com.app.repository.StoryRepository;
import com.app.service.BugTaskService;
import com.app.service.FeatureTaskService;
import com.app.service.StoryTaskService;
import com.app.service.TaskService;
import com.app.service.TaskServiceHandler;

@Configuration
public class BeanConfig {

	@Bean
	public TaskServiceHandler<CreateStoryTaskRequest> storyServiceHandler(StoryRepository repository){
		return new StoryTaskService(repository);
	}
	
	@Bean
	@Qualifier("storyTaskService")
	public TaskService<CreateStoryTaskRequest> storyTaskService(TaskServiceHandler<CreateStoryTaskRequest> serviceHandler){
		return new TaskService<>(serviceHandler);
	}
	
	
	@Bean
	public TaskServiceHandler<CreateBugTaskRequest> bugServiceHandler(BugRepository repository){
		return new BugTaskService(repository);
	}
	
	@Bean
	@Qualifier("bugTaskService")
	public TaskService<CreateBugTaskRequest> bugTaskService(TaskServiceHandler<CreateBugTaskRequest> serviceHandler){
		return new TaskService<>(serviceHandler);
	}
	
	
	@Bean
	public TaskServiceHandler<CreateFeatureTaskRequest> featureServiceHandler(FeatureRepository repository){
		return new FeatureTaskService(repository);
	}
	
	@Bean
	@Qualifier("featureTaskService")
	public TaskService<CreateFeatureTaskRequest> featureTaskService(TaskServiceHandler<CreateFeatureTaskRequest> serviceHandler){
		return new TaskService<>(serviceHandler);
	}
	
}
