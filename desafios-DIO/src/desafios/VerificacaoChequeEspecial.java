package desafios;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        System.out.println(verificarSaldo(saldo,saque,limiteChequeEspecial));

        scanner.close();
    }

    private static String verificarSaldo(double saldo, double saque, double cheque){
        String message = "";
        if(saque <= saldo){
            message = "Transacao realizada com sucesso.";
        }else{
            double totalDispon = verificarChequeEspecial(saldo, cheque);
            if (saque <= totalDispon){
                message = "Transacao realizada com sucesso utilizando o cheque especial.";
            }else{
                message = "Transacao nao realizada. Limite do cheque especial excedido.";
            }
        }

        return message;
    }

    private static double verificarChequeEspecial(double saldo,double limiteChequeEspecial){
        return saldo + limiteChequeEspecial;
    }
}