package com.example.auto1;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Italian implements IMenu {

	@Override
	public List<String> itemsAvailable() {
		// TODO Auto-generated method stub
		return List.of("Pasta","Ricotta","Pizza");
	}
}
