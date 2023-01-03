package com.vicky.feignclient;

import java.util.List;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.vicky.dto.Card;

@FeignClient("cards")
@LoadBalancerClient("cards")
public interface CardFeignClient {

	
	@GetMapping("myCards/get/{customerId}")
	public List<Card> getCardsDetails(@PathVariable("customerId") Integer customerId) ;
}
