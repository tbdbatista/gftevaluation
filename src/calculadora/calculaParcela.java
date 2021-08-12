package calculadora;

import java.util.Scanner;

public class calculaParcela {

    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);
        double valorMoto;
        double novoValor;
        double parcelas;

        System.out.println("Insira o valor da moto: ");
        valorMoto = inputNum.nextDouble();

        System.out.println("As opções de pagamento são: ");

        novoValor = (valorMoto - (valorMoto*0.3));
        System.out.print("Valor a vista com 30% de desconto, R$ ");
        System.out.printf("%.2f", novoValor);

        novoValor = (valorMoto + (valorMoto*0.04));
        parcelas = novoValor/5;
        System.out.print("\nEm 5 vezes com acréscimo de 4%. Com valor total de R$ ");
        System.out.printf("%.2f", novoValor);
        System.out.print(". Com parcelas de R$ ");
        System.out.printf("%.2f", parcelas);

        novoValor = (valorMoto + (valorMoto*0.07));
        parcelas = novoValor/11;
        System.out.print("\nEm 11 vezes com acréscimo de 7%. Com valor total de R$ ");
        System.out.printf("%.2f", novoValor);
        System.out.print(". Com parcelas de R$ ");
        System.out.printf("%.2f", parcelas);

        novoValor = (valorMoto + (valorMoto*0.10));
        parcelas = novoValor/17;
        System.out.print("\nEm 17 vezes com acréscimo de 10%. Com valor total de R$ ");
        System.out.printf("%.2f", novoValor);
        System.out.print(". Com parcelas de R$ ");
        System.out.printf("%.2f", parcelas);

        novoValor = (valorMoto + (valorMoto*0.13));
        parcelas = novoValor/23;
        System.out.print("\nEm 23 vezes com acréscimo de 13%. Com valor total de R$ ");
        System.out.printf("%.2f", novoValor);
        System.out.print(". Com parcelas de R$ ");
        System.out.printf("%.2f", parcelas);

        novoValor = (valorMoto + (valorMoto*0.16));
        parcelas = novoValor/29;
        System.out.print("\nEm 29 vezes com acréscimo de 16%. Com valor total de R$ ");
        System.out.printf("%.2f", novoValor);
        System.out.print(". Com parcelas de R$ ");
        System.out.printf("%.2f", parcelas);

    }
}


//        Faça um programa onde ele receba o valor de uma moto e mostre uma tabela
//        com as seguintes informações: preço final, quantidade de parcelas e valor da
//        parcela.
//        Regras:
//        • Na compra a vista, o valor final tem um desconto de 30%;
//        • As parcelas são: 5, 11, 17, 23 e 29.
//        • A porcentagem de acréscimo segue na tabela abaixo:
//        Quantidade de Parcelas % de acréscimo sobre o preço final
//                        5 4%
//                        11 7%
//                        17 10%
//                        23 13%
//                        29 16%