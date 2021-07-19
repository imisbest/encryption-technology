package com.csw.encryptiontechnology.controller;
import com.csw.encryptiontechnology.utils.MD5Utils;
import com.csw.encryptiontechnology.utils.RSAUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("md5")
public class Md5Test {

    @RequestMapping("doResponse")
    @ResponseBody
    public void doResponse(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = MD5Utils.getPassword("111");//对比
    }
}
