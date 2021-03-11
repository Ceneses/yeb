package com.hcy.server.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcy.server.model.vo.ResponseResult;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName RestAuthorizationEntryPoint
 * @Description
 *  当登录或者token失效访问接口时，自定义的返回结果
 * @Author Han ChengYi
 * @Date 2021/3/11 15:25
 * @Version 1.0
 **/
@Component
public class RestAuthorizationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        PrintWriter out = httpServletResponse.getWriter();
        ResponseResult<String> responseResult = ResponseResult.fail("未登录，请登录！");
        responseResult.setCode(401);
        out.write(new ObjectMapper().writeValueAsString(responseResult));
        out.flush();
        out.close();
    }
}
