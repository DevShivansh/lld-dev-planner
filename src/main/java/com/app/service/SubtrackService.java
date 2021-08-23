package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.requests.CreateSubtractTaskRequest;
import com.app.entities.task.Story;
import com.app.entities.task.Subtrack;
import com.app.exceptions.InvalidOperation;
import com.app.repository.StoryRepository;

@Service
public class SubtrackService {

	
	@Autowired
	private StoryRepository storyRepository;
	
	
	public Subtrack addSubtrack(CreateSubtractTaskRequest request) {
		
		Story story = storyRepository.get(request.getParentTask());
		
		if(story == null)
			throw new InvalidOperation("Parent Story does not exist");
		
		Subtrack subtrack = new Subtrack(story, request.getTitle(), request.getCurrentStatus());
		
		return subtrack;
	}
}
