package utils;

import java.util.Scanner;

public class AreaTriangulo {
    Scanner userInput = new Scanner(System.in);
    private double a;
    private double b;
    private double c;

    public void ejecutar() {
        ingresarDatos();
        double area = obtenerArea(a, b, c);

        System.out.println("El area del triangulo es: " + area);
    }

    public void ingresarDatos() {
        System.out.println("Ingrese el lado a: ");
        a = userInput.nextDouble();
        System.out.println("Ingrese el lado b: ");
        b = userInput.nextDouble();
        System.out.println("Ingrese el lado c: ");
        c = userInput.nextDouble();
    }

    public double obtenerArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        return area;
    }
}
