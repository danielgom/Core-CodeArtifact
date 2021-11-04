package com.core.repository.codeartifact.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<HttpErrorDetails> handleBadRequestException(BadRequestException exception) {

        HttpErrorDetails error = HttpErrorDetails.builder()
                .details(exception.getLocalizedMessage())
                .error(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);

    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<HttpErrorDetails> handleNotFoundException(NotFoundException exception) {

        HttpErrorDetails error = HttpErrorDetails.builder()
                .details(exception.getLocalizedMessage())
                .error(HttpStatus.NOT_FOUND.getReasonPhrase())
                .httpStatus(HttpStatus.NOT_FOUND)
                .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);

    }

}
