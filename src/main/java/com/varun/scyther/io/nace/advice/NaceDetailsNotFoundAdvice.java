package com.varun.scyther.io.nace.advice;

import com.varun.scyther.io.nace.exception.NaceDetailsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class NaceDetailsNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(NaceDetailsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String detailsNotFound(NaceDetailsNotFoundException ex) {
        return ex.getMessage();
    }
}
