package com.example.spring_lessons.service;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.concurrent.Callable;

@RequiredArgsConstructor
@ToString
public class MaxValueSearcherService implements Callable<Integer> {
    private final List<Integer> integers;
    private final int start;
    private final int finish;

    @Override
    public Integer call() {
        int maxValue = Integer.MIN_VALUE;
        for (int i = start; i <= finish; i++) {
            int element = integers.get(i);
            if (maxValue < element) {
                maxValue = element;
            }
        }
        return maxValue;
    }
}
