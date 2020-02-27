import lombok.extern.slf4j.Slf4j;

@Slf4j
public class main {

    public static void main(String[] args) {
        System.out.println("Main no compila");

        String mensaje = null;
        ejecutoMiMetodo(mensaje);
    }

    public static void ejecutoMiMetodo(String mensaje){
        log.info("Este es mi metodo ejecutandose...");
    }
}
