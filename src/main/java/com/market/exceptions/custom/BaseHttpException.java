package com.market.exceptions.custom;

import com.market.exceptions.exceptionhandlers.ApiError;

public class BaseHttpException extends RuntimeException {
    private ApiError apiError;

    public BaseHttpException(ApiError apiError) {
        this.apiError = apiError;
    }

    public ApiError getApiError() {
        return this.apiError;
    }
}
