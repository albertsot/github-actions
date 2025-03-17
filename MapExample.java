import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {

    
        List<String> frases = List.of("Hola mundo", "Java streams", "Hola Java");

        List<String> fraseResultados=frases.stream()
                .flatMap(frase-> Arrays.stream(frase.split(" ")))
                .distinct()
                .toList();
        System.out.println("Resultado esperado: "+fraseResultados);

    
        System.out.println("Se esta subiendo nuevamente");
        List<Integer> numeros=List.of(2,3,6,8);
        for(Integer n: numeros){
            System.out.println(n);
        }

    }
}
