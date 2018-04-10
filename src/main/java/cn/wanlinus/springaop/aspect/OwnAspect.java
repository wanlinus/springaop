package cn.wanlinus.springaop.aspect;

import cn.wanlinus.springaop.annotation.OwnAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 切面
 *
 * @author wanli
 * @date 2018-04-10 19:31
 */
@Aspect
@Component
public class OwnAspect {

    /**
     * 用于描述在什么地方使用该切面
     */
    @Pointcut("@annotation(cn.wanlinus.springaop.annotation.OwnAnnotation)")
    public void pointcut() {
    }


    @Around(value = "pointcut()&&@annotation(ownAnnotation)")
    public Object around(ProceedingJoinPoint joinPoint, OwnAnnotation ownAnnotation) throws Throwable {
        //获取切点传入参数
        if (joinPoint.getArgs() != null) {
            System.out.println("获取传入参数:\t" + Arrays.toString(joinPoint.getArgs()));
        }
        //获取注解内的descript信息
        System.out.println("获取注解描述信息:\t" + ownAnnotation.descript());
        //执行被环绕的切点 obj为切点返回的内容
        Object obj = joinPoint.proceed();
        System.out.println("获取传出参数:\t" + obj.toString());
        //必须有这一步,不然程序一直等待
        return obj;
    }


}
