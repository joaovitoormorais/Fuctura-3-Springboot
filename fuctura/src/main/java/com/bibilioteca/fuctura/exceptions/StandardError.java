package com.bibilioteca.fuctura.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class StandardError { //classe de tratamento de exceções
    @JsonFormat(pattern = "HH:mm - dd/MM/yyyy")
private LocalDateTime timestamp;
private Integer status;
private String message;
private String path;

public StandardError(LocalDateTime timestamp, int value, String message, String path) {
    this.timestamp  = timestamp;
    this.status = status;
    this.message = message;
    this.path = path;
}

public LocalDateTime localDateTime() {
    return localDateTime();
}

public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
}

public Integer getStatus() {
    return status;
}

public void setStatus(Integer status) {
    this.status = status;
}

public String getMessage() {
    return message;
}

public void setMessage(String message) {
    this.message = message;
}

public String getPath() {
    return path;
}

public void setPath(String path) {
    this.path = path;
}

public StandardError() {

}
}
