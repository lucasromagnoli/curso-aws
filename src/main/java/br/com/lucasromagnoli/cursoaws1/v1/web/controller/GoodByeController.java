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
@RequestMapping("/goodbye")
public class GoodByeController {
    private final Logger logger = LoggerFactory.getLogger(GoodByeController.class);

    @GetMapping
    public ResponseEntity<String> goodBye() {
        logger.info("goodBye()");
        return ResponseEntity.ok("Good bye!");
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> goodBye(@PathVariable(value = "name") String name) {
        logger.info("goodBye(String name)");
        return ResponseEntity.ok(String.format("Good bye %s!", name));
    }
}
