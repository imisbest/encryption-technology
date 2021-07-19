package com.csw.encryptiontechnology.controller;

import com.csw.encryptiontechnology.utils.AesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("aes")
public class AESTest {

    @RequestMapping("doResponse")
    @ResponseBody
    public void doResponse(HttpServletRequest request) throws Exception {
        String username = request.getParameter("username");
        String userName2 = AesUtil.decrypt(username);//对比
    }
}
