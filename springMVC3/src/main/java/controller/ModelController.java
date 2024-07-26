package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import pojo.Dept;
import pojo.Employee;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author LHQ
 * @description :
 */
//@SessionAttributes(types = {Dept.class, Employee.class},value = {"user","admin"})
@Controller
public class ModelController {

    @RequestMapping("/string")
    public String login1(HttpServletRequest request) {
        request.setAttribute("msg", "Hello Spring MVC String");
        System.out.println("string 类型的视图");
        return "login";
    }
    //map和Model入参
    @RequestMapping("/map")
    public String login11(Map<String, Object> map) {
        map.put("msg", "Hello Spring MVC Map");
        return "login";
    }
    @RequestMapping("/model")
    public String login2(Model model) {
        System.out.println("model 类型的视图");
        model.addAttribute("msg", "Hello Spring MVC model");
        return "login";
    }

    @RequestMapping("/modelAndView")
    public ModelAndView login3(ModelAndView modelAndView) {
        System.out.println("string 类型的视图");
        modelAndView.addObject("msg", "Hello Spring MVC ModelAndView");
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping("/session")
    public ModelAndView login5(Map<String, Object> map) {
        map.put("user", "LHQ");
        map.put("admin", "admin");
        Dept dept = new Dept();
        dept.setDeptName("开发部");
        map.put("dept", dept);
        map.put("other", "other");
        return  new ModelAndView("login", map);
    }

    @RequestMapping("/modelAttribute")
    public String login6() {
        //dept.setDeptName(dept.getDeptName());
        return "login";
    }

    @ModelAttribute("dept")
    public Dept addAttributes(Model model) {
        model.addAttribute("msg", "哈哈哈哈哈");
        Dept dept = new Dept();
        dept.setDeptName("开发部hhhhhhhhhh");
        return dept;
    }

    //测试自定义视图解析器
    @RequestMapping("/beanName")
    public String testView() {
        return "beanName";
    }
}
