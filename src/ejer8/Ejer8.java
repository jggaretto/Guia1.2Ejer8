
package ejer8;


public class Ejer8 {

    
    public static void main(String[] args) {
        
     // Informar por consola si un número escogido por usted es primo o no
        int numero = 17; // Número escogido para verificar si es primo
        if (Calculo.esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }

        // Mostrar por consola el valor absoluto del valor -90
        int valor = -90; // Valor para obtener su valor absoluto
        System.out.println("El valor absoluto de " + valor + " es: " + Calculo.valorAbsoluto(valor));

        // Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9
        double a = 1;
        double b = 0;
        double c = 9;
        Calculo.calcularRaices(a, b, c);
    }
    
}

/*
Este código crea una clase Calculo con los métodos estáticos esPrimo(), valorAbsoluto()
y calcularRaices(), tal como se describen en el enunciado del proyecto. 
Luego, en la clase principal Main, se utiliza la clase Calculo
*/