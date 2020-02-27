package aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Slf4j
public class Aspectos {

    @Pointcut("@annotation(aspect.MiAnotacion)")
    public void miAnotacion(){}

    @Around("miAnotacion()")
    public Object miAnotacion(ProceedingJoinPoint pjp) throws Throwable{

        log.info("Aquí estoy antes de ejecutar el método");
        Object proceed = pjp.proceed();
        log.info("Aquí estoy después de ejecutar el método");
        


        log.info("Cambiado desde la rama");
        return proceed;
    }

}
