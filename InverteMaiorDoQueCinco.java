/*
2- Escreva uma função que receba uma string de uma ou mais palavras e retorne a mesma string, mas com todas as palavras que
tenham cinco ou mais letras invertidas.

As cadeias de caracteres passadas consistirão apenas de letras e espaços. Os espaços serão incluídos somente quando houver mais de uma palavra.
Exemplos:

"Hey fellow warriors"  --> "Hey wollef sroirraw"
"This is a test        --> "This is a test"
"This is another test" --> "This is rehtona test"

Os métodos : .split() .join() do String são permitidos
 */

//FALTA TRANSFORMAR A PALAVRA EM CHAR NO IF E INVERTER, CONVERTER ESSA PALAVRA INVERTIDA EM STRING,
// E ATRIBUIR A PALAVRA INVERTIDA À POSIÇÃO DO ARRAY DE STRING.


import java.util.Arrays;

public class InverteMaiorDoQueCinco {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite uma frase: ");
//        String frase = scanner.next();

        String fraseFlamengo = "fuselagem do aviao está sobre os destroços";

        String chamei = inverte(fraseFlamengo);

        System.out.println(chamei);

    }


    public static String inverte(String frase) {
        String[] arrayFrase = frase.split(" ");
        int tamanhoArray = 0;
        int tamanhoPalavraATrocar = 0;
        boolean isFoi = false;
        String palavraATrocar = " ";


        for (int i = 0; i < arrayFrase.length; i++) {
            int posicao = 0;
            if (arrayFrase[i].length() > 5) {
                isFoi = true;

                if (true) {
                    posicao = i;
                }
                tamanhoPalavraATrocar = arrayFrase[i].length();


                char[] palavraInvertidaChar = new char[tamanhoPalavraATrocar];
                char[] arrayCharPalavraATrocar = new char[tamanhoPalavraATrocar];

                palavraATrocar = arrayFrase[i];


                for (int j = 0; j < tamanhoPalavraATrocar; j++) {
                    arrayCharPalavraATrocar[j] = palavraATrocar.charAt(j);
                }


                for (int j = tamanhoPalavraATrocar; j > 0; j--) {
                    arrayFrase[posicao] = new String(palavraInvertidaChar);

                    int n = tamanhoPalavraATrocar - 1;

                    for (int k = 0; k < tamanhoPalavraATrocar; k++) {
                        palavraInvertidaChar[k] = palavraATrocar.charAt(n);
                        n--;
                        if (n == -1) {

                            break;
                        }
                    }
                }

            }
        }


        for (int i = 0; i < arrayFrase.length ; i++) {
            System.out.print(arrayFrase[i] + " ");
        }

        return " ";

    }


}


