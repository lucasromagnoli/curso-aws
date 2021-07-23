package br.com.lucasromagnoli.cursoaws1.v1.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author github.com/lucasromagnoli
 * @since 07/2021
 */
@RestController
@RequestMapping("/hello")
public class HelloAwsController {
    private final Logger logger = LoggerFactory.getLogger(HelloAwsController.class);

    @GetMapping()
    public ResponseEntity<String> helloWorld() {
        logger.info("helloWorld()");
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> helloAnyone(@PathVariable(name = "name") String name) {
        logger.info("helloWorld({})", name);
        return ResponseEntity.ok(String.format("Hello %s!", name));
    }
}
