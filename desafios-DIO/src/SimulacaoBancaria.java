import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double saque = 0;
        boolean runProgram = true;

        while (runProgram) {

            int opcao ;


            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    runProgram = false;
                    System.out.println("Programa encerrado.");
                    break;
                case 1:
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    saque = scanner.nextDouble();
                    if(saque > saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo-=saque;
                        System.out.println("Saldo atual: "+ saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }

    }

}