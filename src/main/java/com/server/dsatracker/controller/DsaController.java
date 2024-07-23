package com.server.dsatracker.controller;


import com.server.dsatracker.service.DsaService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dsa")
@RequiredArgsConstructor
public class DsaController {
    private final DsaService dsaService;
    private final Environment environment;
    private String a = "23";

    @GetMapping("/all")
    public ResponseEntity<String> saySomething() {
        return ResponseEntity.ok(environment.getProperty("environment.name"));
    }
}
