package com.bibilioteca.fuctura.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(LocalDateTime timestamp, int value, Integer status, String message, String path) {
        super(timestamp,  status, message, path);
    }

    public ValidationError(LocalDateTime now, int value, String s, String requestURI) {
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void setErrors(List<FieldMessage> errors) {
        this.errors = errors;
    }

    public ValidationError(LocalDateTime timestamp, int value, String message, String path, List<FieldMessage> errors) {
        super(timestamp, value, message, path);
    }

    public void addErros(String fieldName, String message) {
        this.errors.add(new FieldMessage(fieldName, message));
    }

    public ValidationError() {

    }

    public void addErrors(String fieldName, String message) {
        this.errors.add(new FieldMessage(fieldName, message));

    }
}
