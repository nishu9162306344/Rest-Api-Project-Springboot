package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseServices {

	
public List<Course>getCourse();
public Course getCourses(long courseId);
public Course addcourse(Course course);


	
	
}
