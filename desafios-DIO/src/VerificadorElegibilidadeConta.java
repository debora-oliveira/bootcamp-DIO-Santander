import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        System.out.println((idade >= 18) ? "Voce esta elegivel para criar uma conta bancaria." : "Voce nao esta elegivel para criar uma conta bancaria.");

        scanner.close();
    }
}