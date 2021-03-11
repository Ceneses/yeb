package com.hcy.server.config.captcha;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @ClassName CaptchaConfig
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2021/3/11 19:04
 * @Version 1.0
 **/
@Configuration
public class CaptchaConfig {

    @Bean
    public DefaultKaptcha producer(){
        Properties properties = new Properties();
        properties.put("kaptcha.border","yes");
        // 设置边框颜色
        properties.put("kaptcha.border.color","105,179,90");
        properties.put("kaptcha.obscurificator.impl","com.google.code.kaptcha.impl.WaterRipple");
        properties.put("kaptcha.noise.impl","com.google.code.kaptcha.impl.DefaultNoise");
        properties.put("kaptcha.noise.color","72,118,255");
        properties.put("kaptcha.image.width","100");
        properties.put("kaptcha.image.height","40");
        properties.put("kaptcha.textproducer.font.size","40");
        properties.put("kaptcha.textproducer.font.names","宋体,楷体,微软雅黑");
        properties.put("kaptcha.textproducer.font.color","72,118,255");
        properties.put("kaptcha.textproducer.char.length","4");
        properties.put("kaptcha.textproducer.char.space","4");
        properties.put("kaptcha.textproducer.impl","com.google.code.kaptcha.text.impl.DefaultTextCreator");
        properties.put("kaptcha.session.key","code");
        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }

}
