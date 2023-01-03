package com.vicky.dto;

import java.util.List;

import com.vicky.entity.Account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustDetails {
	
	private Account account;
	private List<Card> cardList;
	

}
