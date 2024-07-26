package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author LHQ
 * @description :
 */
@Controller
public class IndexController {

    @GetMapping(value = "login.html")
    //@ResponseBody
    public String index() {
        System.out.println("____________________________");
        return "/index.jsp";
    }
}
