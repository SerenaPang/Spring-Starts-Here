package com.ch13.transaction;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransferRequest {
	private long idsender;
	private long idReceiver;
	private BigDecimal amount;

	public void transferMoney(long idsender, long idReceiver, BigDecimal amount) {
		this.idsender = idsender;
		this.idReceiver = idReceiver;
		this.amount = amount;
	}

	public long getSenderAccountId() {
		return idsender;
	}

	public long getReceiverAccountId() {
		return idReceiver;
	}

	public BigDecimal getAmount() {
		return amount;
	}
}
