package com.lh.pr.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import net.sf.json.JSONObject;

/**
 * 切面，实现打印入参和响应数据
 * @author 刘昊
 *
 */
@Aspect
@Component 
public class PrintAspect {
    
    @Pointcut("@annotation(com.lh.pr.anno.Action)")
    public void annotationPointCut() {
    }
    
    /**
     * 后置处理，打印方法入参和返回值
     * @param point
     * @param returnValue
     */
    @AfterReturning(pointcut="annotationPointCut()",returning="returnValue")
    public void after(JoinPoint point,Object returnValue) {
        Object[] args = point.getArgs();//获取方法参数的参数列表
        
        /*打印方法名称、输入参数、返回直至、织如对象等*/
        System.out.println("-------------------------------");
        System.out.println("@AfterReturning：目标方法为：" + 
                point.getSignature().getDeclaringTypeName() + 
                "." + point.getSignature().getName());
        System.out.println("@AfterReturning：参数为：" + 
                Arrays.toString(args));
        System.out.println("@AfterReturning：返回值为：" + returnValue);
        System.out.println("@AfterReturning：被织入的目标对象为：" + point.getTarget());
        
        /*打印方法接受的参数列表对象，使用json格式输出*/
        for(Object arg : args) {
            JSONObject json1 = JSONObject.fromObject(arg);
            System.out.println("打印入参"+json1.toString());
        }
        
        /*打印方法返回值，使用json格式输出*/
        JSONObject json = JSONObject.fromObject(returnValue);
        System.out.println("打印响应"+json.toString());
    }
}
