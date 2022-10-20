package com.vicky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.pojo.NumberInput;
import com.vicky.pojo.Results;
import com.vicky.service.Calculation;

@RestController
@RequestMapping("/summer")
public class SumController {
	
	@Autowired
	private Calculation calculation;
	
	@RequestMapping("/sum")
	public int sumOfTwo(@RequestParam("num1") String num1,@RequestParam("num2") String num2) {

		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		int sumoftwo = number1 + number2;
		
		return sumoftwo;
	}
	
	@RequestMapping("/summ")
	@ResponseBody
	public Results sumOfTwo1(@RequestParam("num1") String num1,@RequestParam("num2") String num2) {

		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		int sumoftwo = number1 + number2;
		
		Results res = new Results(number1, number2, sumoftwo);
		
		return res;
	}
	
	@RequestMapping("/summm")
	@ResponseBody
	public Results sumOfTwo2(@RequestParam("num1") String num1,@RequestParam("num2") String num2) {

		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		
		return calculation.SumofTwoNum(number1,number2);
	}
	
	@GetMapping("/getsum")
	@ResponseBody
	public Results getSum(@RequestParam("num1") String num1,@RequestParam("num2") String num2) {

		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		
		return calculation.SumofTwoNum(number1,number2);
	}
	
	@PostMapping("/postsum")
	@ResponseBody
	public Results postSum(@RequestBody NumberInput numberInput ) {

		int number1 = numberInput.getNum1();
		int number2 = numberInput.getNum2();
		
		return calculation.SumofTwoNum(number1,number2);
	}
	
	
	


}
