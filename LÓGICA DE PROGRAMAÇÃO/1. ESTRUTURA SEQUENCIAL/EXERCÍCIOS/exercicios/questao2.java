package exercicios;

import java.util.Scanner;

public class questao2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double pi = 3.14159;
    double raio;
    double area;

    System.out.println("Digite o tamanho do raio: ");
    raio = sc.nextDouble();

    area = pi * Math.sqrt(raio);

    System.out.printf("O valor da área é: %.4f", area);
    
    sc.close();
}
}
