package client.one.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Client1Controller {
    private static final Logger logger = LoggerFactory.getLogger(Client1Controller.class);
    private final List<String> names;

    public Client1Controller() {
        names = Arrays.asList("John", "Smith", "Washington");
    }

    @GetMapping("/names")
    public List<String> getNames() {
        logger.trace("Trace names");
        logger.debug("Debug names");
        logger.info("Info names");
        logger.warn("Warn names");
        logger.error("Error names");
        return names;
    }

    @PostMapping("/name/{name}")
    public void addName(@PathVariable final String name) {
        names.add(name);
    }
}
