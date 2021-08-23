package com.app;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.entities.requests.CreateStoryTaskRequest;
import com.app.entities.requests.CreateSubtractTaskRequest;
import com.app.entities.task.Story;
import com.app.entities.task.Subtrack;
import com.app.entities.task.Task;
import com.app.enums.TaskStatus;
import com.app.service.SubtrackService;

@SpringBootApplication
public class TemplateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TemplateApplication.class, args);
		task1(context);
	}

	private static void task1(ApplicationContext context) {
		
		TaskRunner runner = context.getBean(TaskRunner.class);
		
		CreateStoryTaskRequest request = new CreateStoryTaskRequest("s1", "shivansh", LocalDateTime.now(), 
				TaskStatus.OPEN, "summary 1");
		
		Task task = runner.createStoryTask(request);
		System.out.println(task);
		
		SubtrackService subtrackService = context.getBean(SubtrackService.class);
		
		Task task2 = runner.createStoryTask(request);
		System.out.println(task2);
		
		CreateSubtractTaskRequest st1 = new CreateSubtractTaskRequest("new sub track1", TaskStatus.OPEN, task2.getId());
		
		Subtrack subtrack1 = subtrackService.addSubtrack(st1);
		
		System.out.println((Story) task2);
		System.out.println(subtrack1);
		
		
		
	}

}
