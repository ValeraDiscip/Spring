package com.example.spring_lessons.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ValueSearcherService {
    private final ExecutorService executorService;
    private final int threadsCount;

    public ValueSearcherService(int threadsCount) {
        executorService = Executors.newFixedThreadPool(threadsCount);
        this.threadsCount = threadsCount;
    }

    public int findMaxValue(List<Integer> list) {
        List<Future<Integer>> tasks = createThreadFindMaxValue(list);
        return tasks.stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                })
                .max(Integer::compareTo)
                .get();
    }

    private List<Future<Integer>> createThreadFindMaxValue(List<Integer> list) {
        List<Future<Integer>> futures = new ArrayList<>();
        int elementsForThread = (int) Math.ceil((float) list.size() / threadsCount);
        for (int i = 0; i < threadsCount; i++) {
            int finish = i * elementsForThread - 1 + elementsForThread;
            if (finish > list.size() - 1) {
                finish = list.size() - 1;
            }
            MaxValueSearcherService maxValueSearcher = new MaxValueSearcherService(list, i * elementsForThread, finish);
            futures.add(executorService.submit(maxValueSearcher));
        }
        return futures;
    }
}
