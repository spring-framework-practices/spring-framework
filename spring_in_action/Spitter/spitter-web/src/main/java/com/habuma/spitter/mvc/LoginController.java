package com.habuma.spitter.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(method = GET)
    public void showLoginForm() {
    }
}
