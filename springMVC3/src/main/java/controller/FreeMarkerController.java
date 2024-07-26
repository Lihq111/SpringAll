package controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import javax.annotation.Resource;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LHQ
 * @description :
 */
@Controller
public class FreeMarkerController {
    @Resource
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @RequestMapping("/getHtml")
    @ResponseBody
    public String getHtml() throws Exception {
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        Template template = configuration.getTemplate("hello.ftl");
        Map<Object, Object> dataModel = new HashMap<>();
        //创建数据模型
        dataModel.put("name", "LHQ");
        //输出文件writer对象
        Writer out = new FileWriter("D:\\IDEA\\springAll\\springMVC3\\src\\main\\webapp\\WEB-INF\\ftl\\spring-freeMarker.html");
        //渲染模板
        template.process(dataModel, out);
        //关闭writer对象
        out.close();
        return "success";
    }
}
