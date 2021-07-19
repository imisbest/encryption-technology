package com.csw.encryptiontechnology.controller;
import com.csw.encryptiontechnology.utils.RSAUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("rsa")
public class RSATest {
    @RequestMapping("getKey")
    @ResponseBody
    public String getKey(HttpServletRequest request) {
        String publicKey = RSAUtils.generateBase64PublicKey();
        return publicKey;
    }
    @RequestMapping("doResponse")
    @ResponseBody
    public void doResponse(HttpServletRequest request) {
        String en_username = request.getParameter("username");
        String en_pwd = request.getParameter("password");
        //反编译对比
        String username = RSAUtils.decryptBase64(en_username.trim());
        String password = RSAUtils.decryptBase64(en_pwd.trim());
    }
}
