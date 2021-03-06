package hu.lamsoft.booker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String greeting(Model model) {
        model.addAttribute("name", "Csaba");
        return "welcome";
    }
    
}
