package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Created by qd on 2017/7/19.
 */
@Aspect
@Component
public class TokenAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 处理token，将token decode为user后放入Attribute
     * 校验不通过的拒绝执行业务
     * @return
     */

    @Around("@annotation(annotation.CheckToken)")
   public Object accessToken(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        logger.info("拦截成功！");
        //用改变后的参数执行目标方法
        Object[] args = proceedingJoinPoint.getArgs();
        return proceedingJoinPoint.proceed(args);

   }
}
