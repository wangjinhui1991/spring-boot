package com.example.interceptor;

import com.example.exception.ResultException;
import com.example.util.ResponVo;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ExceptionController {
    private static Logger logger = Logger.getLogger(ExceptionController.class);

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(ResultException.class)
    public @ResponseBody ResponVo exceptionHandler(ResultException ex){
        return new ResponVo(ex.getMessage());
    }
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    public @ResponseBody ResponVo exceptionHandler(Exception ex){
        logger.error(ex);
        return new ResponVo("系统异常");
    }
}
