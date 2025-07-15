package com.learningSpringBoot.mvcs.mvcs.advices;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class GlobalResponseHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        // true means beforeBodyWrite will be applied to every controller response.
        // this is used when we aim to uniformly wrap all our responses in something like ApiResponse
        return true;

        // return false:-> beforeBodyWrite will be skipped and the original response
        // from the body will be returned as it is.
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response){
        if (body instanceof ApiResponse<?>){
            return body;
        }

        return new ApiResponse<>(body);
    }
}
