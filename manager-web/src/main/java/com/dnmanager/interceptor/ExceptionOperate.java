package com.dnmanager.interceptor;

import com.dnmanager.HaltException;
import com.dnmanager.base.Result;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class ExceptionOperate {
    Gson gson = new Gson();


    @ExceptionHandler(HaltException.class)
    @ResponseBody
    public void handleBizExp(HttpServletRequest request, HttpServletResponse response, Exception ex) throws IOException {
        if (ex instanceof HaltException) {
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();

            response.setStatus(200);
            writer.append(gson.toJson(Result.error(ex.getMessage())));
        }
    }


    @ExceptionHandler()
    public void handlerException(HttpServletRequest request, HttpServletResponse response, Exception ex) throws IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        response.setStatus(200);
        writer.append(gson.toJson(Result.error("服务器异常，抢修中")));
    }


    @ExceptionHandler(NullPointerException.class)
    public void handlerNullException(HttpServletRequest request, HttpServletResponse response, Exception ex) throws IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        response.setStatus(200);
        writer.append(gson.toJson(Result.error("妈的，出现异常了！！！")));
    }

}


