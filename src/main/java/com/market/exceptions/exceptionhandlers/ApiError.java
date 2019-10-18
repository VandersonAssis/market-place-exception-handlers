package com.market.exceptions.exceptionhandlers;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
class ApiError {
    private HttpStatus status;
    private String message;
    private List<String> errors;

    ApiError(HttpStatus status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        errors = Collections.singletonList(error);
    }

    ApiError(HttpStatus status, String message) {
        super();
        this.status = status;
        this.message = message;
    }
}
