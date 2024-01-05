package com.spring21.spring.controllers;

import com.spring21.spring.services.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("ids") List<Integer> ids) {
        storeService.add(ids);
        return "Товар довавлен";
    }

    @GetMapping(path = "/get")
    public Collection<Integer> get() {
        return storeService.get();
    }
}
