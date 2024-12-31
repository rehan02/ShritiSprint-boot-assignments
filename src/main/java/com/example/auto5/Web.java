package com.example.auto5;

import org.springframework.stereotype.Component;

@Component
public class Web implements IGames {
	@Override
	public void GamesPlayed() {
		System.out.println("Chess");
		System.out.println("Table Tennis");
	}
}
