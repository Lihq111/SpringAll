package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LHQ
 * @description :
 */
@Controller
public class IndexController {

    @RequestMapping(value = "login" , method = {RequestMethod.GET})
    public String index() {
        System.out.println("_____________________________________");
        return "index.jsp";
    }
}