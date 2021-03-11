package com.hcy.server.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @ClassName CaptchaController
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2021/3/11 19:11
 * @Version 1.0
 **/
@RestController
public class CaptchaController {

    @Autowired
    private DefaultKaptcha defaultKaptcha;

    @ApiOperation(value = "验证码")
    @GetMapping(value = "/captcha", produces = "image/jpg")
    public void captcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        httpServletResponse.setDateHeader("Expires",0);
        httpServletResponse.setHeader("Cache-Control","no-store, no-cache, must-revalidate");
        httpServletResponse.addHeader("Cache-Control","post-check=0, pre-check=0");
        httpServletResponse.setHeader("Pragma","no-cache");
        httpServletResponse.setContentType("image/jpeg");

        String text = defaultKaptcha.createText();
        System.out.println("验证码内容 = " + text);
        httpServletRequest.getSession().setAttribute("captcha",text);
        BufferedImage image = defaultKaptcha.createImage(text);
        ServletOutputStream outputStream = null;
        try {
             outputStream = httpServletResponse.getOutputStream();
             // 输出流文件为jpg
            ImageIO.write(image,"jpg",outputStream);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != outputStream){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
