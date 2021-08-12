package controle.vacina;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tipoVacina;
        String dataPrimeiraDose;
        Scanner inputNum = new Scanner(System.in);
        Scanner inputData = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();

        System.out.println("*******************************************");
        System.out.println("*     Sistema de controle de vacinas      *");
        System.out.println("*******************************************\n");

        System.out.println("Informe a marca da vacina tomada:");
        System.out.println("Digite 1 para Coronavac.");
        System.out.println("Digite 2 para Janssen.");

        tipoVacina = inputNum.nextInt();

        while ( !(tipoVacina == 1 || tipoVacina == 2)){
            System.out.println("Número digitado inválido.");
            System.out.println("Informe a marca da vacina tomada:");
            System.out.println("Digite 1 para Coronavac.");
            System.out.println("Digite 2 para Janssen.");
            tipoVacina = inputNum.nextInt();
        }

        switch(tipoVacina) {
            case 1:
                System.out.println("Você tomou a Coronavac. ");
                System.out.println("Qual foi a data da aplicação? (use o formato dd/mm/yyyy)");
                dataPrimeiraDose = inputData.nextLine();

                break;
            case 2:
                System.out.println("Você tomou a vacina da Janssen. ");
                System.out.println("Qual foi a data da aplicação? (use o formato dd/mm/yyyy)");
                dataPrimeiraDose = inputData.nextLine();
                System.out.println("Essa vacina é dose única e não requer segunda dose.");
                System.out.println("Parabéns, o seu esquema de vacinação contra o Covid-19 está completo.");
                System.out.println("Continue usando máscara e mantenha o distânciamento para previnir a transmissão " +
                        "para pessoas que ainda não terminaram o esquema de vacinação.");
                break;
            default:
                System.out.println("Valor inválido.");
        }




    }
}
