package com.cajadeahorro.admin.controllers;

import com.cajadeahorro.admin.models.Credit;
import com.cajadeahorro.admin.repository.CreditsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class WelcomeController {

    @Autowired
    private CreditsRepository creditsRepository;

    @GetMapping
    public String index(Model model) {
        Iterable<Credit> credits = creditsRepository.findAll();

        model.addAttribute("credits", credits);

        return "welcome";
    }
}
