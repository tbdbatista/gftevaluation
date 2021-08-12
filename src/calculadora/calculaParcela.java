package calculadora;

import java.util.Scanner;

public class calculaParcela {

    public static void main(String[] args) {

        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        Double valorMoto;

        System.out.println("Insira o valor da moto: ");
        valorMoto = inputNum.nextDouble();

        System.out.println("As opções de pagamento são: ");
        System.out.println("Valor a vista com 30% de desconto, R$ " + (valorMoto - (valorMoto*0.3)));
        System.out.println("Em 5 vezes com acréscimo de 4%." +
                " Com valor total de R$ " + (valorMoto + (valorMoto*0.04)) + ". Com parcelas de R$ " +
                ((valorMoto + (valorMoto*0.04))/5));
        System.out.println("Em 11 vezes com acréscimo de 4%." +
                " Com valor total de R$ " + (valorMoto + (valorMoto*0.07)) + ". Com parcelas de R$ " +
                ((valorMoto + (valorMoto*0.07))/11));
        System.out.println("Em 17 vezes com acréscimo de 4%." +
                " Com valor total de R$ " + (valorMoto + (valorMoto*0.10)) + ". Com parcelas de R$ " +
                ((valorMoto + (valorMoto*0.10))/17));
        System.out.println("Em 23 vezes com acréscimo de 4%." +
                " Com valor total de R$ " + (valorMoto + (valorMoto*0.13)) + ". Com parcelas de R$ " +
                ((valorMoto + (valorMoto*0.13))/23));
        System.out.println("Em 29 vezes com acréscimo de 4%." +
                " Com valor total de R$ " + (valorMoto + (valorMoto*0.16)) + ". Com parcelas de R$ " +
                ((valorMoto + (valorMoto*0.16))/29));

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