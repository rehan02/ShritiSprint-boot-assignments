package com.example.auto4;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Drama implements IMovie {
	@Override
	public List<String> printMovies(String language) {
		// TODO Auto-generated method stub
		if( language.equals("Tamil"))
			return Arrays.asList("Amaran","Vedalam");
		if( language.equals("Telugu"))
			return Arrays.asList("Pushpa1","Pushpa2");
		if( language.equals("English"))
			return Arrays.asList("Cinderalla","Secret");
		else
			return Arrays.asList("No movies");
	}
}
