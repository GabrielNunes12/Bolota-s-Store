package com.artesdabolota.ArtesDaBolota.Controllers.Exceptions;

import com.artesdabolota.ArtesDaBolota.Services.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(ExceptionHandler.class)
    public ResponseEntity<StandardErrors> objectNotFound(ExceptionHandler e, HttpServletRequest httpServletRequest) {
        StandardErrors errors = new StandardErrors();
        errors.setTimestamp(Instant.now());
        errors.setStatus(HttpStatus.NOT_FOUND.value());
        errors.setError("Object not found");
        errors.setMessage(e.getMessage());
        errors.setPath(httpServletRequest.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors);
    }
}
