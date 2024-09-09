import java.util.Scanner;

// QUESTÃO 2//

public class questao2 {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a String");
        String texto = scanner.nextLine();
        
        int contador = contarA(texto);

        if (contador > 0) {
            System.out.println("A letra 'a' maiúscula ou minúscula aparece " + contador + " vezes"); 
        } else {
            System.out.println("A letra 'a' não foi encontrada");
        }

        scanner.close();

    }

    public static int contarA(String texto) {

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A' ) {
                contador++;
            }
        }
        return contador;
    }
}
