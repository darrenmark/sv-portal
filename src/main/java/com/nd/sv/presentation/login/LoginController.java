package com.nd.sv.presentation.login;

import com.nd.sv.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 */
@Controller
public class LoginController {

    @RequestMapping("/login.login")
    public String login(ModelMap model, @ModelAttribute("user") User user, HttpSession session, HttpServletRequest request,HttpServletResponse response) {
        System.out.println("Callled...");
        if (request.getMethod().equals("POST") ) {
            if(user.getLoginId().equals("darren")) {
                return "forward:./main.login";
            } else {
                model.put("error", "User or Password is incorrect");
                //model.put("errorMessage","User or Password is incorrect");
                model.put("user",user);
            }
        } else {
            model.put("error","");
            model.put("user", new User());
        }
        return "./WEB-INF/jsps/login";
    }

    @RequestMapping("/main.login")
    public String main(ModelMap model, HttpSession session, HttpServletRequest request,HttpServletResponse response) {
        System.out.println("main");
        return "./WEB-INF/jsps/main";
    }

    public String getName() {
         return "darren";
    }

}
