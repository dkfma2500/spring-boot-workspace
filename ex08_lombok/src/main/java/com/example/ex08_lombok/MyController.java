package com.example.ex08_lombok;
import java.lang.reflect.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public @ResponseBody String root() throws Exception {
        return "Lombok 사용하기";
    }

    
        @RequestMapping("/test3")
        public String test3(Member member, Model model){
            return "test3";
        }
    

       

    }

