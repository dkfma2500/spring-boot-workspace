package com.example.ex11_vaildation_initbinder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.validation.Valid;



@Controller
public class MyController {
    
    @RequestMapping("/")
    public @ResponseBody String root() {
        return "Validation (1)";
    }

    @RequestMapping("/insert-form")
    public String insert1(@ModelAttribute("dto") ContentDTO contentDto) {
        return "createPage";
    }
    
    // @RequestMapping("/insert-form")
    // public String insert1(Model model) {
    //     model.addAttribute("dto", new ContentDTO());
    //     return "createPage";
    // }

    @RequestMapping("/create")
    public String insert2(@ModelAttribute("dto") @Valid ContentDTO contentDto, BindingResult result) {
        String page = "createDonePage";

        ContentValidator validator = new ContentValidator();
        validator.validate(contentDto, result);

        System.out.println("valitadion result: " + result.hasErrors());

        if(result.hasErrors()) {
            page = "createPage";
        }

        return page;
    }

    @InitBinder
    protected void initbinder (WebDataBinder binder) {
        binder.setValidator(new ContentValidator());
    }


}
