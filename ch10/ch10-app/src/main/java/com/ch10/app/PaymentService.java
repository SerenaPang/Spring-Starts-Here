package com.ch10.app;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	public PaymentDetails processPayment() {
		throw new NotEnoughMoneyException();
	}
}
