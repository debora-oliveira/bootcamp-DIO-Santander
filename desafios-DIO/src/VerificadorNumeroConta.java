import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta = "";
        try {
            numeroConta = scanner.next();
            System.out.println(verificarNumeroConta(numeroConta));

        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }



    }

    private static String verificarNumeroConta(String numeroConta) {
        boolean contaValida = false;
        String message = "";
        contaValida = numeroConta.matches("[0-9]+");
        if(numeroConta.matches("[0-9]+") && (numeroConta.length() == 8)){
            message = "Numero de conta valido.";
        }else{
            message = "Numero de conta invalido. Digite exatamente 8 digitos.";
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");

        }
        return message;
    }
}
