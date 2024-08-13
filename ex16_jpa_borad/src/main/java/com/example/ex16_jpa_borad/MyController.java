package com.example.ex16_jpa_borad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ex16_jpa_borad.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;

// @Controller
// public class MyController {

//     @Autowired
//     //BoardService.boardService;

//     @RequestMapping("/")
//     public String root() throws Exception {
//         return "redirect:list";
//     }
    
//     @RequestMapping("/list")
//     public String userlistPage(Model model) {
//         model.addAttribute("list", boardService.listDAO());
//         return "list";
//     }
    
//     @RequestMapping("/view")
//     public String view(HttpServletRequest request, Model model) {
//         Integer id = Integer.parseInt(null, 0, 0, 0) request.getParameter("id");
//         model.addAttribute("dto", boardService.viewDAO(id));
//         return "view";
//     }

//     @RequestMapping("/write-form")
//     public String writeForm() {
//         return "write-form";
//     }

//      @RequestMapping("/write")
//      public String write(Model model, HttpServletRequest request) {
//         boardService.writeDAO(request.getParameter("writer"), 
//          request.getParameter("title"),
//          request.getParameter("content"));

//          return "redirect:list";
//      }

//      @RequestMapping("/delete")
//      public String delete(Model model, HttpServletRequest request) {
//         boardService.deleteDAO(request.getParameter("id"));
        
//          return "redirect:list";
//     }
// }
