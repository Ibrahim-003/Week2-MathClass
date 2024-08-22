package utils;

import java.util.Scanner;

public class NumeroAleatorio {
    Scanner userInput = new Scanner(System.in);
    private int valorMinimo;
    private int valorMaximo;

    public void ejecutar() {
        ingresarDatos();
        int num = obtenerNumero(valorMinimo, valorMaximo);
        System.out.println("El numero aleatorio generado es: " + num);
    }

    public void ingresarDatos() {
        System.out.print("Ingresa el valor mínimo del rango: ");
        valorMinimo = userInput.nextInt();
        System.out.print("Ingresa el valor máximo del rango: ");
        valorMaximo = userInput.nextInt();
    }

    public int obtenerNumero(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
