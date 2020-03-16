package a2i.sdi.chinchilla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(HttpServletRequest request) {
        System.out.println("login()");
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(HttpServletRequest request) {
        if (request != null) {
            System.out.println("request is not null " + request.getMethod());
        } else {
            System.out.println("request is null");
        }
        return "feed";
    }
}
