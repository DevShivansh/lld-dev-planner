package com.app.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.app.entities.task.Feature;
import com.app.entities.task.Story;

@Repository
public class FeatureRepository extends HashMap<Integer, Feature>{

}
