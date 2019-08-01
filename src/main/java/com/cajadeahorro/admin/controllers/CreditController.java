package com.cajadeahorro.admin.controllers;

import com.cajadeahorro.admin.models.Credit;
import com.cajadeahorro.admin.repository.CreditsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequestMapping("/credit")
public class CreditController {

    @Autowired
    private CreditsRepository creditsRepository;

    @PostMapping("{id}")
    public String udpate(@PathVariable("id") int id, Model model) {
        Credit credit = creditsRepository.findById(id).get();
        credit.setStartDate(new Timestamp(new Date().getTime()));

        creditsRepository.save(credit);

        Iterable<Credit> credits = creditsRepository.findAll();

        model.addAttribute("credits", credits);

        return "welcome";
    }

}
