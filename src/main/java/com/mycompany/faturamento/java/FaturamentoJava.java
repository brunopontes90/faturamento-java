
package com.mycompany.faturamento.java;

import java.util.Scanner;

public class FaturamentoJava {

    public static void main(String[] args) {
        System.out.println("********** SISTEMA DE FATURAMENTO **********");
        Scanner scanner = new Scanner(System.in);
              
        System.out.print("Nome do produto: ");
        String produto = scanner.next();
        
        System.out.print("Preço do Produto: ");
        float preco = scanner.nextFloat();
        
        System.out.print("Unidades: ");
        int qtdUnidade = scanner.nextInt();
        
        float valorTotal = preco * qtdUnidade;
        System.out.print("Valor Total a Pagar: " + valorTotal);
        
    }
}
