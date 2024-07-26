package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Dept;

/**
 * @author LHQ
 * @description :
 */
@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/get/{id}")
    @ResponseBody//会自动将对象转换为json格式
    public Dept getJson(@PathVariable("id") Integer id) {
        Dept dept = new Dept();
        dept.setDeptNo(10);
        dept.setDeptName("测试部");
        System.out.println(id);
        return dept;
    }
}
