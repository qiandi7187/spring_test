package pojo;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* pojo.Fruit.count(..,String,..)) && args(..,s,*)")
    public void count(String s){}

    @Before("count(s)")
    public void beforeLog(String s){
        logger.info("方法调用前执行:"+s);
    }


    /*@Around("count(i,s)")
    public void aroundLog(ProceedingJoinPoint pjp,int i,String s){
        logger.info("方法调用前执行:"+ i);
        i *=10;
        Object[] objects = pjp.getArgs();
        objects[0] =  i;
        System.out.println("---------------");
        for(Object o:objects){
            System.out.println(o);
        }
        try {
            pjp.proceed(objects);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("方法调用后执行:"+ i);

    }*/





}
