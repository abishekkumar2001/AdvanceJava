package com.demo.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/home")
    public String loggerDemo(){
        logger.info("Logger Info");
        logger.warn("Logger Warn");
        logger.debug("Logger Debug");
        return "Logger Demo";
    }

}
