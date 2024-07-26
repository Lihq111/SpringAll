package controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author LHQ
 * @description :
 */
@Controller
public class FileController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        //将文件保存到指定位置
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File("D:/A/" + file.getOriginalFilename()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "forward:/file.jsp";
    }

    @RequestMapping("/upload1")
    public String upload1(@RequestParam("file") CommonsMultipartFile[] file) {
        //将文件保存到指定位置
        for (CommonsMultipartFile f : file) {
            try {
                if (f.getSize() > 0) {
                    FileUtils.copyInputStreamToFile(f.getInputStream(), new File("D:/A/" + f.getOriginalFilename()));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return "forward:/index.jsp";
    }

    @RequestMapping("/upload2")
    public String upload2(@RequestParam("file") MultipartFile file) {
        //将文件保存到指定位置
        //if (file.getSize() > 0) {
            String originalFilename = file.getOriginalFilename();
            String path = "D:/A/";
            File newFile = new File(path + originalFilename);
            if (!newFile.getParentFile().exists()) {
                boolean returnVal = newFile.getParentFile().mkdirs();
                if (!returnVal) {
                    throw new RuntimeException("创建文件夹失败");
                }
            }
            try {
                file.transferTo(newFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        //}
        return "forward:/file.jsp";
    }

}
