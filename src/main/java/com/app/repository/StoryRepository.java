package com.app.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.app.entities.task.Story;

@Repository
public class StoryRepository extends HashMap<Integer, Story>{

}
