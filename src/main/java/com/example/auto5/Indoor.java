package com.example.auto5;

import org.springframework.stereotype.Component;

@Component
public class Indoor implements IGames {
	@Override
	public void GamesPlayed() {
		System.out.println("CandyCrush");
		System.out.println("RoadRunner");
	}
}
