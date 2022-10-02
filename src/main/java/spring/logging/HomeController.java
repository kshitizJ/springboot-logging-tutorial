package spring.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * Springboot uses SLF4J implementation for logging and the library used is
 * lOGBack.
 * 
 * Here we have changed the implementation of the logging using Logger class in
 * SLF4J package.
 * 
 */

@RestController
public class HomeController {

    // To add logging
    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String hello() {

        /**
         * 
         * We have different logger methods.
         * 
         * Eg: Trace < Debug < Info < Warn < Error
         * 
         */

        // logger.error("FATAL Error");
        // logger.trace("msg");
        logger.info("msg");
        return "index";
    }

}
