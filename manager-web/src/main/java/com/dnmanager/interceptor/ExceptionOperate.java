package com.dnmanager.interceptor;

import com.dnmanager.HaltException;
import com.dnmanager.base.Result;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class ExceptionOperate {
    Gson gson = new Gson();


    @ExceptionHandler(Exception.class)
    public void handlerException(HttpServletRequest request, HttpServletResponse response, Exception ex) throws IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        response.setStatus(200);

        if (ex instanceof HaltException) {
            writer.append(gson.toJson(Result.error(((HaltException) ex).getCode(),ex.getMessage())));
        } else if (ex instanceof NullPointerException) {
            writer.append(gson.toJson(Result.error("当初说好的，我要什么你都会给我的!!!")));
        } else if(ex instanceof ClassCastException){
            writer.append(gson.toJson(Result.error("请检查你的三围尺寸!!!")));
        } else {
            ex.printStackTrace();
            writer.append(gson.toJson(Result.error("服务器异常，抢修中")));
        }
    }




}


