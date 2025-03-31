package edu.paganini;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comeco, fim;
        
        System.out.printf("Digite o primeiro parâmetro: ");
        comeco = sc.nextInt();
        
        System.out.printf("Digite o segundo parâmetro: ");
        fim = sc.nextInt();

        try {
            contar(comeco, fim);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }

    static void contar(int comeco, int fim) throws ParametrosInvalidosException {
        if (comeco > fim)
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser maior que o primeiro.");
        
        int contagem = fim - comeco;
        for(int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}