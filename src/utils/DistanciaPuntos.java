package utils;

import java.util.Scanner;

public class DistanciaPuntos {
    private Scanner userInput = new Scanner(System.in);
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public void ejecutar() {
        ingresarDatos();
        double distancia = obtenerDistancia(x1, y1, x2, y2);

        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }

    public void ingresarDatos() {

        System.out.println("Ingrese la coordenada x1: ");
        x1 = userInput.nextDouble();

        System.out.println("Ingrese la coordenada y1: ");
        y1 = userInput.nextDouble();

        System.out.println("Ingrese la coordenada x2: ");
        x2 = userInput.nextDouble();

        System.out.println("Ingrese la coordenada y2: ");
        y2 = userInput.nextDouble();
    }

    public Double obtenerDistancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}
