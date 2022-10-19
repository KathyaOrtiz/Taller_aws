package com.taller.api_taller.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
     private static final Logger logger = LoggerFactory.getLogger(GreetingsController.class);
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
         logger.info("este es el inicio del log");
        logger.debug("parametro recibido: ()", name);
        return "Hello " + name + "!";
    }
      @RequestMapping("/")
    public String home(){
        System.out.println("Este es el inicio del log");
        return "Hola mundo";
    }
}
