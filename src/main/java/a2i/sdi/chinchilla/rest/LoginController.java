package a2i.sdi.chinchilla.rest;

import a2i.sdi.chinchilla.dao.UserDao;
import a2i.sdi.chinchilla.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private UserDao userDao;

    @Autowired
    public LoginController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/login")
    public String login(Model model, HttpServletRequest request) {
        model.addAttribute("userLogin", new User());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute User user, Model model) {
        if(user.getUsername().length() > 0 && user.getPassword().length() > 0) {
            user = userDao.find(user);
            if(user != null) {
                System.out.println(user.getId() + ":" + user.getUsername() + ":" + user.getPassword()
                        + ":" + user.getEmail() + ":" + user.getFirstName() + ":" + user.getLastName());
                return "feed";
            }
        }

        // todo: display if wrong credentials
        return "login";
    }
}
