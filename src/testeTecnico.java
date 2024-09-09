import java.util.Scanner;

public class testeTecnico {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para fazer a verificação!");
        int numero = scanner.nextInt();

       if (Fibonnaci(numero)) {
            System.out.println("O número " + numero + " pertence a sequência de fibonnaci!");
       } else {
            System.out.println("O número " + numero + " NÃO pertence a sequência de fibonnaci!");
       }

       scanner.close();
    }

    public static boolean Fibonnaci(int num){
        if (num == 0 || num == 1) {
            return true;
        }
    

    int a = 0;
    int b = 1;
    int soma = a+b;

        while (soma <= num) {
           if (soma == num) {
                return true;
            }
            a = b;
            b = soma;
            soma = a + b;
        }

        return false;

    }
}
