package com.example.spring_lessons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class AppError {
    int statusCode;
    String message;
}