package aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
@Aspect
public class CheckAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());




    @Around("execution(* controller.*.*(..))")
    public void aroundLog(ProceedingJoinPoint joinPoint){
        logger.info("方法调用前执行Around");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("方法调用后执行Around");
    }
}
