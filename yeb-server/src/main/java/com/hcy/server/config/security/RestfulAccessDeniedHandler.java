package com.hcy.server.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcy.server.model.vo.ResponseResult;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName RestfulAccessDeniedHandler
 * @Description
 *  当访问接口没有权限时，自定义返回结果
 * @Author Han ChengYi
 * @Date 2021/3/11 15:31
 * @Version 1.0
 **/
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        PrintWriter writer = httpServletResponse.getWriter();
        ResponseResult<String> responseResult = ResponseResult.fail("权限不足，请联系管理员！");
        responseResult.setCode(403);
        writer.write(new ObjectMapper().writeValueAsString(responseResult));
        writer.flush();
        writer.close();
    }
}
