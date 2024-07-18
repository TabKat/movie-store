package com.lv.moviestore.controllers;

import com.lv.moviestore.models.DistinctDemo;
import com.lv.moviestore.services.DistinctDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/api/v1/distinct")
public class DistinctDemoController {
    DistinctDemoService distinctDemoService;

    @Autowired
    public DistinctDemoController(DistinctDemoService distinctDemoService) {
        this.distinctDemoService = distinctDemoService;
    }

    @GetMapping
    List<DistinctDemo> getDistinct() {
        return distinctDemoService.getDistinct();
    }
}
