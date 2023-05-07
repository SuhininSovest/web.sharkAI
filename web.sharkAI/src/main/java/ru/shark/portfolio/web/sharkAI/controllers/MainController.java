package ru.shark.portfolio.web.sharkAI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("home", "Home");
        return "home";
    }
    @GetMapping("/products")
    public String product(Model model) {
        model.addAttribute("home", "Home");
        return "home";
    }
    @GetMapping("/products-info")
    public String productInfo(Model model) {
        model.addAttribute("home", "Home");
        return "home";
    }
    @GetMapping("/blogs")
    public String blog(Model model) {
        model.addAttribute("home", "Home");
        return "blog";
    }
}
