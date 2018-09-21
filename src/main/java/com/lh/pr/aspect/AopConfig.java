package com.lh.pr.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 切面配置
 * @author 刘昊
 *
 */
@Configuration
@ComponentScan("com.lh.pr.aspect")
@EnableAspectJAutoProxy
public class AopConfig {  
}
