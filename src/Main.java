import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluguel[] vetor = new Aluguel[10];
        System.out.println("Quantos quartos vão ser alugados?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Cadastro Aluguel");
            System.out.println("Nome: ");
            String name = scan.next();
            System.out.println("Email: ");
            String email = scan.next();
            System.out.println("Quarto: ");
            int quarto = scan.nextInt();
            vetor[quarto] = new Aluguel(name, email);;
            }

        System.out.println("Quartos ocupados");
        for (int i=0; i<10; i++){
            if (vetor [i] != null){
                System.out.println(i + " " + vetor[i]);
            }

        }
    }
}