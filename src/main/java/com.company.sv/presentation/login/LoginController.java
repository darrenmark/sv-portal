package com.company.sv.presentation.login;

import com.company.sv.domain.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 */
public class LoginController {

    @RequestMapping("/login")
    public String login(ModelMap model, @ModelAttribute("user") User user, HttpSession session, HttpServletRequest request) {
        System.out.println("Callled...");
        if (request.getMethod().equals("POST") ) {
            if(user.getLoginId().equals("darren")) {
                return "forward:./main";
            }
        } else {
            model.put("user", new User());
        }
        return "forward:./login";
    }
}
