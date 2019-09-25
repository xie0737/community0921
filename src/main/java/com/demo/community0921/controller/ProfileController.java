package com.demo.community0921.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {
    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name = "action") String action,
                          Model model){
        if ("questions".equals(action)){
            model.addAttribute("session","questions");
            model.addAttribute("sessionName","我的提问");
        }else if("replies".equals(action)){
            model.addAttribute("session","replies");
            model.addAttribute("sessionName","最新回复");
        }
        return "profile";
    }
}
