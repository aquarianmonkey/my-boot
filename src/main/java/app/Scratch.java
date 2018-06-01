package app;

import model.rest.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class Scratch {

    private static final Logger log = LoggerFactory.getLogger(Scratch.class);

    public static void main(String args[]) {

        RestTemplate restTemplate = new RestTemplate();

        //Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        //log.info(quote.toString());

        Greeting greeting = restTemplate.getForObject("http://localhost:8080/greeting/Enzo", Greeting.class);

        log.info(greeting.toString());

    }

}
