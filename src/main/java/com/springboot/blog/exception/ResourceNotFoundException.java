package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private long fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
        super(String.format("%s not found with %s:'%s'", resourceName, fieldName, fieldValue)); // Post not found with
                                                                                                // id:1
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public long getFieldValue() {
        return fieldValue;
    }
}

// we have not used setters because we 're already passing those values from the
// constructor defined
// this @ResponseStatus(value = HttpStatus.NOT_FOUND) annotation will cause
// spring boot to respond with HTTP status code whenever this exception is
// thrown from REST controller
// customized exception will extend RunTimeException class