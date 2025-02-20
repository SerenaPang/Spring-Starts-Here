package com.ch13.transaction;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransferService {
	private final AccountRepository accountRepository;
	
	public TransferService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@Transactional
	public void transferMoney(long idSender, long idReceiver, BigDecimal amount) {
		Account sender = accountRepository.findAccountById(idSender);
		Account receicer = accountRepository.findAccountById(idReceiver);
		
		BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
		BigDecimal receiverNewAmount = receicer.getAmount().add(amount);
		
		accountRepository.changeAmount(idSender, senderNewAmount);
		accountRepository.changeAmount(idReceiver, receiverNewAmount);
	}
}
