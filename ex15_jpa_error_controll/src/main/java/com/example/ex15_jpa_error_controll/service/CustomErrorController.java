package com.example.ex15_jpa_error_controll.service;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handlerError(HttpServletRequest httpServletRequest) {
        Integer statuscode = (Integer) httpServletRequest.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        Object log;
         System.out.println("error code - " + statuscode);
        //log.error("error code - " + statuscode);
        return "redirect:/not-found";
    }
    @RequestMapping("/not-found")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound() {
        return "nut-found";
    }
}
