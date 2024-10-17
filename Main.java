// Este codigo pertenece a la primera practica del Sprin 3.

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        // Dimensiones de la picina 1
        float piscina1Largo;
        float piscina1Ancho;
        float piscina1Profundo;

        // Dimensiones de la piscina 2
        float piscina2Largo;
        float piscina2Ancho;
        float piscina2Profundo;

        // Preguntamos al teclado las medidas de las piscinas.
        System.out.println("Cual es el largo de la piscina 1? ");
        piscina1Largo = sc.nextFloat();

        System.out.println("Cual es el Ancho de la piscina 1? ");
        piscina1Ancho = sc.nextFloat();

        System.out.println("Cual es el Profundo de la piscina 1? ");
        piscina1Profundo = sc.nextFloat();

        System.out.println("Cual es el Largo de la piscina 2? ");
        piscina2Largo = sc.nextFloat();

        System.out.println("Cual es el Ancho de la piscina 2? ");
        piscina2Ancho = sc.nextFloat();

        System.out.println("Cual es el Profundo de la piscina 2? ");
        piscina2Profundo = sc.nextFloat();

        // Calculamos las areas de las priscinas.
        // Piscina 1.
        float area1 = piscina1Ancho * piscina1Largo;
        // Piscina 2.
        float area2 = piscina2Ancho * piscina2Largo;

        // Calculamos el vilumen de las piscinas.
        // Psicina 1
        float volumen1 = piscina2Ancho * piscina2Profundo * piscina2Largo;
        // Piscina 2
        float volumen2= piscina2Ancho * piscina2Profundo * piscina2Largo;

        System.out.println("El area de la piscina 1 es = " + area1 + " cm.");
        System.out.println("El area de la piscina 2 es = " + area2 + " cm." + "\n");
        System.out.println("El voluem de agua de la piscina 1 es = " + volumen1 + " cm3.");
        System.out.println("El voluem de agua de la piscina 1 es = " + volumen2 + " cm3." + "\n");

        // Calculamos el largo y ancho de las dos piscinas juntas.
        double anchoJuntas = piscina1Ancho + piscina2Ancho;
        double areaJuntas = area1 + area2;
        System.out.println("El largo de las dos piscinas juntas es = " + piscina1Largo + "\n" + "Ya que las dos piscinas tienen " +
                "el mismo largo");
        System.out.println("El ancho de las dos piscinas juntas es = " + anchoJuntas + "\n");

        System.out.println("El area de las dos piscinas juntas es = " + areaJuntas);

        System.out.println("El volumet de las dos piscinas juntas es = " + (volumen1 + volumen2) + " cm3.\n");

        // Ahora intercambiamos datos.




    }
}
