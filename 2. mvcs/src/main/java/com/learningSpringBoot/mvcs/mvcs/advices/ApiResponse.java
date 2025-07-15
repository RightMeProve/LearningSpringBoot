package com.learningSpringBoot.mvcs.mvcs.advices;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {
    private T data;
    private ApiError error;
    @JsonFormat(pattern = "hh:mm:ss dd-MM-YYYY")
    private LocalDateTime timestamp;

    // at one time it can have only one field, either data or error

    public ApiResponse(){
        this.timestamp = LocalDateTime.now();
    }

    public ApiResponse(T data){
        this(); // invoke the default constructor which initializes the timestamp
        this.data =data;
    }

    public ApiResponse(ApiError error){
        this();
        this.error = error;
    }

}
