package com.cajadeahorro.admin.controllers;

import com.cajadeahorro.admin.models.Credit;
import com.cajadeahorro.admin.repository.CreditsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    private CreditsRepository creditsRepository;

    @GetMapping("{id}")
    public String index(Model model, @PathVariable("id") int id) {
        Credit credit = creditsRepository.findById(id).get();

        model.addAttribute("credit", credit);

        return "userdetail";
    }

}
