package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Backend implements ICourse {

	@Override
	public List<String> getAllCourses() {
		// TODO Auto-generated method stub
		return Arrays.asList("Spring","Java","Microservices");
	}

}
