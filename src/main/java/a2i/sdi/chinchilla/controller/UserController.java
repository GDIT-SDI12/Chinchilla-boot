package a2i.sdi.chinchilla.controller;

import a2i.sdi.chinchilla.dao.UserDao;
import a2i.sdi.chinchilla.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("")
    public String findAll(Model model) {
        List<User> users = userDao.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }
}
