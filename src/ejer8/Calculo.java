/*
 En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
 esPrimo(): Este método recibe un número entero y retorna true si el número recibido es
primo, caso contrario retornará false.
 valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
 calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo
grado y mostrará por consola sus raíces y si no las tiene también lo informará.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Calculo:
a) Informar por consola si un número escogido por usted es primo o no.
b) Mostrar por consola el valor absoluto del valor -90;
c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.

 */
package ejer8;

public class Calculo {
     // Método estático para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si el número es divisible por algún número mayor que 1, no es primo
            }
        }
        return true; // Si no es divisible por ningún número mayor que 1, es primo
    }

    // Método estático para calcular el valor absoluto de un número
    public static int valorAbsoluto(int num) {
        return Math.abs(num); // Utilizamos la función abs de la clase Math para obtener el valor absoluto
    }

    // Método estático para calcular las raíces de una ecuación de segundo grado
    public static void calcularRaices(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c; // Calculamos el discriminante
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a); // Calculamos la primera raíz
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a); // Calculamos la segunda raíz
            System.out.println("Las raíces de la ecuación son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a); // Calculamos la única raíz (discriminante igual a 0)
            System.out.println("La ecuación tiene una única raíz: " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces reales."); // No hay raíces reales (discriminante negativo)
        }
    }
}
