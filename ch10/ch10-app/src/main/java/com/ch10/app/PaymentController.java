package com.ch10.app;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	private final PaymentService paymentService;
	private static Logger logger = Logger.getLogger(PaymentController.class.getName());

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

//	@PostMapping("/payment")
//	public ResponseEntity<?> makePayment(){
//		try {
//			//we call the method in payment service
//			PaymentDetails paymentDetails = paymentService.processPayment();
//			//if calling service method succeeds, return an http response with status accepted and payment detail instance as response body
//			return ResponseEntity
//					.status(HttpStatus.ACCEPTED)
//					.body(paymentDetails);
//		} catch(NotEnoughMoneyException e) {
//			ErrorDetails errorDetails = new ErrorDetails();
//			errorDetails.setMessage("Not enough money to make the payment");
//			//if an exception of NotEnoughMoneyException, return an http response with status badRequest and an errorDetails instance as a body
//			return ResponseEntity.badRequest().body(errorDetails);
//		}
//	}
	// no exception, but create a separate class
//	@PostMapping("/payment")
//	public ResponseEntity<PaymentDetails> makePayment() {
//		// we call the method in payment service
//		PaymentDetails paymentDetails = paymentService.processPayment();
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
//	}
	
	//curl -v -X POST http://127.0.0.1:8080/payment -d '{"amount": 1000}' -H "Content-Type: application/json"
	//getting data from client in the request body
	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails) {
		// we call the method in payment service
		logger.info("Recived payment " + paymentDetails.getAmount());
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
	}
}
