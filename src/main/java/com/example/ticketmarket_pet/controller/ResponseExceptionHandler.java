package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.dto.ErrorExtension;
import com.example.ticketmarket_pet.exeption.UserNotFoundException;
import com.example.ticketmarket_pet.exeption.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorExtension> handleUserNotFoundException(Exception e) {
        return new ResponseEntity<>(new ErrorExtension(
                e.getMessage(),
                ErrorCode.USER_NOT_FOUND
        ), HttpStatus.NOT_FOUND);
    }


}