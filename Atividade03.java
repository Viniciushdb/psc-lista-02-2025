import java.util.Scanner;

public class Atividade03 {
    
    public static void main(String[] args) {
        
        int nota1, nota2, nota3, nota4;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas notas: ");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();
        nota4 = sc.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.println("A média dos 4 números é: " + media);
        
        sc.close();
    }
}
