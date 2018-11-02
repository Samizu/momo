package com.cmbchina.exception.resolve;

import com.cmbchina.exception.TopException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResponseBodyExceptionResolver {

    private final Logger LOGGER = LoggerFactory.getLogger(ResponseBodyExceptionResolver.class);

    @ExceptionHandler(TopException.class)
    public TopException handleBizException(TopException topException) {
        LOGGER.error("exception handler: " + topException.getMessage(), topException);
        return topException;
    }
}
