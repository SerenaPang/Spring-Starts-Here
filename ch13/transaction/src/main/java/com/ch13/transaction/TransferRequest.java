package com.ch13.transaction;

import java.math.BigDecimal;

public record TransferRequest(

		long senderAccountId,

		long receiverAccountId,

		BigDecimal amount) {
}
