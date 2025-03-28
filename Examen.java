import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {

        //Calcular el interes mediante la formula 

        //Variables

        Scanner EntradaCapital = new Scanner(System.in);
        System.out.print("ECapital");
        double Capital = EntradaCapital.nextDouble();

        Scanner EntradaTasa = new Scanner(System.in);
        System.out.print("EntradaTsa");
        double Tasa = EntradaTasa.nextDouble();

        Scanner ETiempo = new Scanner(System.in);
        System.out.print("ETiempo");
        double Tiempo = ETiempo.nextDouble();

        //Proceso

        double interes = Capital * Tasa * Tiempo / 100;

        //Resultado
        System.out.println("El interes es de " + interes + " cada mes");

   
    }
}
