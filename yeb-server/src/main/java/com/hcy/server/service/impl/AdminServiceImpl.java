package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.config.security.JwtTokenUtil;
import com.hcy.server.mapper.AdminMapper;
import com.hcy.server.model.entity.AdminEntity;
import com.hcy.server.model.vo.ResponseResult;
import com.hcy.server.service.AdminService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * (Admin)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("adminService")
public class AdminServiceImpl extends ServiceImpl<AdminMapper, AdminEntity> implements AdminService {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    /**
     * 登录之后返回 TOKEN
     * @param username
     * @param password
     * @param httpServletRequest
     * @return
     */
    @Override
    public ResponseResult login(String username, String password, HttpServletRequest httpServletRequest) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if(!Optional.ofNullable(userDetails).isPresent() || !passwordEncoder.matches(password, userDetails.getPassword())){
            return ResponseResult.fail("用户名或密码不正确");
        }
        if(!userDetails.isEnabled()){
            return ResponseResult.fail("账号被警用！请联系管理员");
        }
        // 更新security登录用户对象
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
        // 生成TOKEN
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return ResponseResult.success(tokenMap);
    }

    @Override
    public AdminEntity getAdminByUsername(String userName) {
        return adminMapper.selectOne(new QueryWrapper<AdminEntity>().eq("username",userName).eq("enabled",true));
    }
}