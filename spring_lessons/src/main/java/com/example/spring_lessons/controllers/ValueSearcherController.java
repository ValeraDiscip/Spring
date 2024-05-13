package com.example.spring_lessons.controllers;

import com.example.spring_lessons.service.ValueSearcherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValueSearcherController {
    @PostMapping(value = "/findMaxValue")
    public long findMaxValue(@RequestParam("list") List<Integer> list, @RequestParam("threadCount") int threadCount) throws IllegalArgumentException {
        if (list == null || list.isEmpty() || threadCount <= 0) {
            throw new IllegalArgumentException("List cannot be null or empty, threadCount must be less than 0");
        }
        ValueSearcherService valueSearcherService = new ValueSearcherService(threadCount);
        return valueSearcherService.findMaxValue(list);
    }
}