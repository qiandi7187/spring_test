package pojo;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Before("execution(* pojo.Fruit.grow(..))")
    public void beforeLog(){
        logger.info("方法调用前执行");
    }

    @Before("execution(* pojo.Fruit.grow(..))")
    public void beforeLog2(){
        logger.info("方法调用前执行2");
    }

    @AfterReturning("execution(* pojo.Fruit.grow())")
    public void afterLog(){
        logger.info("方法调用后执行");
    }


    @Around("execution(* pojo.Fruit.grow())")
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
