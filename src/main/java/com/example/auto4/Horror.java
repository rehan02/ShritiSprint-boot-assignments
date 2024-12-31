package com.example.auto4;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Horror implements IMovie {

	@Override
	public List<String> printMovies(String language) {
		// TODO Auto-generated method stub
		if( language.equals("Tamil"))
			return Arrays.asList("Kanchana","Aranmamai","Tamil horror movie 4");
		if( language.equals("Telugu"))
			return Arrays.asList("Stree","Boomi");
		if( language.equals("English"))
			return Arrays.asList("Tricked","Nun");
		else
			return Arrays.asList("No movies");
	}
}
