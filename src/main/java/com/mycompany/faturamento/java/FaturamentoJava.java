package com.mycompany.faturamento.java;

import java.util.Scanner;

public class FaturamentoJava {

    public static void main(String[] args) {
        System.out.println("********** SISTEMA DE FATURAMENTO **********");
        Scanner scanner = new Scanner(System.in);

        String produto;
        float preco;
        int qtdUnidade;
        float calculando;
        float valorTotal = 0;
        String opcao;

        do {
            System.out.print("Nome do produto: ");
            produto = scanner.next();

            System.out.print("Preço do Produto: ");
            preco = scanner.nextFloat();

            System.out.print("Unidades: ");
            qtdUnidade = scanner.nextInt();

            calculando = preco * qtdUnidade;
            valorTotal += calculando;

            System.out.print("Deseja continuar? (S/N): ");
            opcao = scanner.next().toUpperCase();

            if ("N".equals(opcao)) {
                System.out.print("Valor Total a Pagar: " + valorTotal);
            }
        } while ("S".equals(opcao));
    }
}
