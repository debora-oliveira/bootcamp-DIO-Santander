import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();

        for (int i = 0; i < 5; i++) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;

            }else if(valorSaque >= limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            else if(valorSaque <= limiteDiario){
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: "+limiteDiario);
                System.out.println("Transacoes encerradas.");
                break;
            }
            else {
                System.out.println("Saque realizado. Limite restante: "+limiteDiario);
                System.out.println("Transacoes encerradas.");
                break;
            }
        }
        scanner.close();

    }
}