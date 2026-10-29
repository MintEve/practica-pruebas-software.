
package calculadora;
import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la parte real del primer número complejo:");
        float real1 = scanner.nextFloat();
        System.out.println("Ingrese la parte imaginaria del primer número complejo:");
        float imaginario1 = scanner.nextFloat();
        
        NumeroComplejo num1 = new NumeroComplejo(real1, imaginario1);

         System.out.println("Ingrese la parte real del segundo número complejo:");
        float real2 = scanner.nextFloat();
        System.out.println("Ingrese la parte imaginaria del segundo número complejo:");
        float imaginario2 = scanner.nextFloat();
        
        NumeroComplejo num2 = new NumeroComplejo(real2, imaginario2);

        // Crear un objeto para realizar las operaciones
        NumeroComplejo operaciones = new NumeroComplejo(0, 0);

        // Realizar operaciones
        NumeroComplejo suma = operaciones.suma(num1, num2);
        NumeroComplejo resta = operaciones.resta(num1, num2);
        
        // Mostrar resultados
        System.out.println("La suma de los números complejos es: " + suma);
        System.out.println("La resta de los números complejos es: " + resta);
        
        scanner.close();
    }
    
}

