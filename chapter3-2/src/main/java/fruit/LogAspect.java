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



    @Pointcut("execution(* fruit.Fruit.count(int)) && args(countInt)")
    public void count(int countInt){}


    @Before("count(countInt)")
    public void beforeLog(int countInt){
        logger.info("方法调用前执行:"+countInt);
    }


    @Around("count(countInt)")
    public void aroundLog(ProceedingJoinPoint pjp,int countInt){
        logger.info("方法调用前执行:"+countInt);
        countInt *=10;
        Object[] objects = pjp.getArgs();
        objects[0] = countInt;
        System.out.println("---------------");
        for(Object o:objects){
            System.out.println(o);
        }
        try {
            pjp.proceed(objects);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("方法调用后执行:"+countInt);

    }





}
