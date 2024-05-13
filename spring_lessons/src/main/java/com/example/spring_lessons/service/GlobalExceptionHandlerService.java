package com.example.spring_lessons.service;

import com.example.spring_lessons.dto.AppError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerService {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<AppError> illegalArgumentExceptionHandler(IllegalArgumentException ex) {
        AppError appError = new AppError(HttpStatus.NOT_ACCEPTABLE.value(),  ex.getMessage());
        return new ResponseEntity<>(appError, HttpStatus.NOT_ACCEPTABLE);
    }
}
