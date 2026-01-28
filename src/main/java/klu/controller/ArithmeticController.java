package klu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArithmeticController {

    @GetMapping("/add/{A}/{B}")
    public Map<String, Object> add(@PathVariable("A") int a,
                                   @PathVariable("B") int b) {

        Map<String, Object> response = new HashMap<>();
        response.put("result", a + b);
        response.put("A", a);
        response.put("B", b);
        response.put("operation", "addition");

        return response;
    }
}
