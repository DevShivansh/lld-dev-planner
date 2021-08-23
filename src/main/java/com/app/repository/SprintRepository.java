package com.app.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.app.entities.Sprint;
import com.app.entities.task.Story;

@Repository
public class SprintRepository extends HashMap<Integer, Sprint>{

}
