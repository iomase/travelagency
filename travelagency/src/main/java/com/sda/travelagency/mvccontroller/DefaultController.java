package com.sda.travelagency.mvccontroller;

import com.sda.travelagency.dto.UserDTO;
import com.sda.travelagency.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DefaultController {
    @Autowired
    private UserDetailService userService;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new UserDTO());
        return "/register";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") UserDTO userDto) {
        userService.register(userDto);
        return "/home-page";
    }

    @GetMapping("/")
    public String home1() {
        return "/home-page";
    }

    @GetMapping("/home")
    public String home() {
        return "/home-page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/admin/addUserPage")
    public String addUserPage() {
        return "/addUserPage";
    }

    @GetMapping("/admin/addDeleteUsers")
    public String addDeleteUsers() {
        return "/addDeleteUsers";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
