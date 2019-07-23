package com.cajadeahorro.admin.controllers;

import com.cajadeahorro.admin.models.UserInfo;
import com.cajadeahorro.admin.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WelcomeController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping("/welcome")
    public String index(Model model){
        Iterable<UserInfo> userInfoList = userInfoRepository.findAll();

        for (UserInfo userInfo : userInfoList) {
            model.addAttribute("name", userInfo.getName() + " " + userInfo.getLastName() + " " + userInfo.getMiddleName());
        }


        return "welcome";
    }
}
