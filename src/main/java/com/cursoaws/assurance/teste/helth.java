package com.cursoaws.assurance.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helth {
    @GetMapping("/helth")
    public String helth() {
        return "ok";
    }
}
