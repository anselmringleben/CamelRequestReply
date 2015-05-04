package ringleben.CamelRequestReply.consumer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

/**
 * This class processes incoming messages and issues a word count reply
 * 
 * @author anselm.ringleben
 *
 */
@Log4j
@Component
public class FileImportConsumer implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		log.debug("Method process called: " + exchange);

		String input = exchange.getIn().getBody(String.class);
		int result = input.split(" ").length;

		log.debug("Input: " + input + "; result: " + result);

		exchange.getOut().setBody(input + " ; response: " + result);
	}
}
