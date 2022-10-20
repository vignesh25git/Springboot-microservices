package com.vicky.service;

import org.springframework.stereotype.Service;

import com.vicky.pojo.Results;

@Service
public class CalculationImpl implements Calculation {

	@Override
	public Results SumofTwoNum(int number1,int number2) {
		
		int sumoftwo = number1 + number2;
		Results res = new Results(number1, number2, sumoftwo);
		return res;

	}

}
