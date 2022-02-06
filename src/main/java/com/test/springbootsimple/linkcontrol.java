package com.test.springbootsimple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class linkcontrol {
    @GetMapping("/link")
    public String link_page(Model model){
        return "link";
    }
}
