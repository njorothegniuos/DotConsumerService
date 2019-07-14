package com.DotConsumerService;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.DotConsumerService.model.Transaction;

@EnableBinding(Sink.class)
public class MessageConsumer {
	
	@StreamListener(Sink.INPUT)
	public void logTransaction(Transaction txn) {
		System.out.println("Message contains loanid: "+txn.getLoanId());
		
	}

}
