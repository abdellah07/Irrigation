package com.naji.gmail.irrigation.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IrrigationController {

    @GetMapping("/test")
    public String test() {
        return "hello world !!";
    }
}
