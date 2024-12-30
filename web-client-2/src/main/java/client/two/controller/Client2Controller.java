package client.two.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Client2Controller {
    private static final Logger logger = LoggerFactory.getLogger(Client2Controller.class);

    @GetMapping("/words")
    public List<String> getWords() {
        logger.trace("Trace words");
        logger.debug("Debug words");
        logger.info("Info words");
        logger.warn("Warn words");
        logger.error("Error words");
        return Arrays.asList("Word1", "Word2", "Word3", "Word4");
    }
}
