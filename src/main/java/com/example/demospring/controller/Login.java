package com.example.demospring.controller;

import com.example.demospring.dao.LoginDao;
import com.example.demospring.domain.Ordertest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Login {

    @Autowired
    LoginDao loginDao;
    @RequestMapping("/login")
    public String login() {
        List<Ordertest> login = loginDao.login();
        for (Ordertest order:login
             ) {
            System.out.println(order.getName());
        }

        return "view/success.html";
    }

}
