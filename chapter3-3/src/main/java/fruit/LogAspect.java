package fruit;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @Pointcut("execution(* fruit.Fruit.*(..))")
    public void count(){}


    @Before("count()")
    public void beforeLog(){
        logger.info("方法调用前执行:");
    }


    @Around("count()")
    public void aroundLog(ProceedingJoinPoint pjp){
        logger.info("方法调用前执行:");
        Object[] objects = pjp.getArgs();
        System.out.println("---------------");
        for(Object o:objects){
            System.out.println(o);
        }
        try {
            pjp.proceed(objects);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("方法调用后执行:");

    }





}
