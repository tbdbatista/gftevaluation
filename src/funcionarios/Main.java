package funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios();
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        int verifica;

        System.out.println("Cadastre as informações do funcionário:");
        System.out.println("Nome: ");
        funcionarios.setName(inputText.nextLine());
        System.out.println("Cargo: ");
        funcionarios.setPosition(inputText.nextLine());

        System.out.println("Digite 1 para verificar o status do funcionário cadastrado.");
        System.out.println("Digite 2 para verificar esquema de trabalho.");
        System.out.println("Digite qualquer outro valor para sair do aplicativo");
        verifica = inputNum.nextInt();

        while ( verifica == 1 || verifica == 2){

            switch(verifica) {
                case 1:
                    System.out.println(funcionarios);
                    System.out.println("Digite 1 para verificar o status do funcionário cadastrado.");
                    System.out.println("Digite 2 para verificar esquema de trabalho.");
                    System.out.println("Digite qualquer outro valor para sair do aplicativo");
                    verifica = inputNum.nextInt();
                    break;
                case 2:
                    funcionarios.verificaHomeOffice(funcionarios.getPosition());
                    System.out.println("Digite 1 para verificar o status do funcionário cadastrado.");
                    System.out.println("Digite 2 para verificar esquema de trabalho.");
                    System.out.println("Digite qualquer outro valor para sair do aplicativo");
                    verifica = inputNum.nextInt();
                    break;
                default:
                    System.out.println("Valor inválido.");
            }

        }
    }
}
