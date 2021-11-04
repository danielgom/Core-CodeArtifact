package com.core.repository.codeartifact.exceptions;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class HttpErrorDetails {

    private HttpStatus httpStatus;
    private String error;
    private String details;

}
