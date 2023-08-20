package com.himash.controller;

import com.himash.service.NumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class NumberController {

    private final NumberService numberService;

    @GetMapping
    public String fetchNumberDetails() {
        return numberService.fetchDetails();
    }

}
