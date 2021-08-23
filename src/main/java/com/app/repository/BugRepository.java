package com.app.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.app.entities.task.Bug;
import com.app.entities.task.Story;

@Repository
public class BugRepository extends HashMap<Integer, Bug>{

}
