package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	public int calculator(int num1, int num2, String operator) {
		int result = 0;
		
		switch(operator) {
		case "plus":
			result = num1 + num2;
			break;
		case "minus":
			result = num1 - num2;
			break;
		case "multi":
			result = num1 * num2;
			break;
		case "division":
			result = num1 / num2;
			break;
		default:
			result = 0;
			break;
		}
		
		return result;

	}
}