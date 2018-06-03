package ua.com.mmplus.promomanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainMenuController {

    @GetMapping("/menu")
    public String mainMenu(){
        return "menu";
    }
}
