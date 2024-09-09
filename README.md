## Questions

1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

4) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____


5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

## Response

## QUESTÃO 1

import java.util.Scanner;

public class questao1 {

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

## QUESTÃO 2

import java.util.Scanner;

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

## QUESTÃO 3

int INDICE = 12;
int SOMA = 0;
int K = 1;

enquanto K < INDICE faça {
    K = K + 1;
    SOMA = SOMA + K;
}

imprimir(SOMA);
//O valor final da soma será 77//

## QUESTÃO 4

4- Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____

Resposta:
a) 9
b) 128
c) 49
d) 100
e) 13
f) 20

## QUESTÃO 5

5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas
 diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar 
 os interruptores quantas vezes quiser. Seu objetivo 
 é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir,usando 
apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  


Resposta:
Ligo o primeiro interruptor e o deixo ligado por cerca de 5 minutos. Esse tempo é suficiente para que a lâmpada conectada a ele aqueça.

Após 5 minutos, desligo o primeiro interruptor e ligo o segundo interruptor. Deixo o segundo interruptor ligado.

Vou até a sala das lâmpadas para verificar o estado delas.

Na sala das lâmpadas
A lâmpada que está acesa é controlada pelo segundo interruptor, pois foi o último que eu liguei.
A lâmpada que está apagada, mas quente ao toque, é controlada pelo primeiro interruptor, porque esteve ligada por um tempo e foi desligada antes de eu ir para a sala.
A lâmpada que está apagada e fria é controlada pelo terceiro interruptor, que nunca foi ligado.
Com esse método, descubro qual interruptor controla cada lâmpada usando apenas uma ida à sala das lâmpadas.
