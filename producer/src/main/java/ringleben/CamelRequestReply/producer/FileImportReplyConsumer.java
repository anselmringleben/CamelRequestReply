package ringleben.CamelRequestReply.producer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

/**
 * This class receives the replies from consumer:FileImportConsumer
 * 
 * @author anselm.ringleben
 *
 */
@Log4j
@Component
public class FileImportReplyConsumer implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		log.debug("Method process called: " + exchange);

		log.debug("Response: " + exchange.getIn().getBody(String.class));
	}

}
