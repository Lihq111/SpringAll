package controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pojo.Employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * @author LHQ
 * @description :
 */
@Controller
@RequestMapping("/index")
public class loginController {
    @RequestMapping("/login0")
    public String login() {
        System.out.println("++++++++++++++++++++++++");
        return "login";
    }
    @RequestMapping("/login1")
    public ModelAndView login1() {
        System.out.println("111111111111111111111111");
        return new ModelAndView(new RedirectView("login0"));
    }

    @RequestMapping(value = "login.html", params = "name=admin")
    public String login2() {
        System.out.println("------------------------");
        return "login";
    }

    //测试请求参数
    @RequestMapping(value = "/param1", method = RequestMethod.POST)
    public String login3(Employee employee) {
        System.out.println("Employee{" +
                "id=" + employee.getId() +
                ", name='" + employee.getName() + '\'' +
                ", email='" + employee.getEmail() + '\'' +
                ", dept=" + employee.getDept().getDeptName() +
                '}');
        return "login";
    }

    //测试路径参数
    @RequestMapping(value = "/param2", method = RequestMethod.POST)
    public String login4(Integer[] ids) {
        System.out.println("id=" + Arrays.toString(ids));
        return "index";
    }

    //测试路径参数
    @RequestMapping (value = "/param5")
    public String login5(@RequestBody List<Employee> employees ) {
        for (Employee employee : employees){
            System.out.println("Employee{" +
                    "id=" + employee.getId() +
                    ", name='" + employee.getName() + '\'' +
                    ", email='" + employee.getEmail() + '\'' +
                    ", dept=" + employee.getDept().getDeptName() +
                    '}');
        }
        return "forward:/index.jsp";
    }

    //测试路径参数
    @RequestMapping (value = "/param6")
    public String login6(@RequestBody List<String> name ) {
        for (String s : name) {
            System.out.println(s);
        }
        return "forward:/index.jsp";
    }

    //测试路径参数
    @RequestMapping (value = "/param7")
    public String login7(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request.getParameter("name"));
        return "forward:/index.jsp";
    }

    //测试登录拦截器
    @RequestMapping(value = "/login111")
    public String login8(@RequestParam("hello") String userName,HttpServletRequest request) {
        request.getSession().setAttribute("user",userName);
        return "redirect:login0";
    }

}
