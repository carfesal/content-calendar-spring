package github.carfesal.contentcalendar.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @Value("${cc.message: Default Welcome Message}")
    private String message;
    @GetMapping("/")
    public Map<String, String> home(){
        return Map.of("message", message);
    }
}
