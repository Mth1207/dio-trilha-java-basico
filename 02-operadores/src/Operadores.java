public class Operadores {
    public static void main(String[] args) {
        // // ------------- OPERADOR DE ATRIBUIÇÃO E COMO FUNCIONA A CONCATENAÇÃO. ↓

        // String concatenacao = "?";

        // concatenacao = 1 + 1 + 1 + "1";

        // System.out.println(concatenacao); // "31"

        // concatenacao = 1 + "1" + 1 + 1;

        // System.out.println(concatenacao); // "1111"

        // concatenacao = 1 + "1" + 1 + "1";

        // System.out.println(concatenacao); // "1111"

        // concatenacao = "1" + 1 + 1 + 1;

        // System.out.println(concatenacao); // "1111"

        // concatenacao = "1" + (1 + 1 + 1);

        // System.out.println(concatenacao); // "13"

        // // ------------- OPERADORES UNÁRIOS. ↓

        // int numero = 5;

        // System.out.println(-numero); // o "-" nao muda o valor da variável inicial.

        // System.out.println(numero); // valor original

        // numero = -numero; // se eu quero que o valor da variável original passa a ser
        // negativo, precisa ser feito dessa forma. Onde o valor da variável será
        // trocado realmente.

        // System.out.println(numero);

        // numero = numero * -1; // se eu quero voltar o valor da variável para
        // positivo, preciso fazer com essa multiplicação, fazendo `numero = + numero`,
        // o "+" será considerado como operador matemático e nao inverterá o valor.

        // System.out.println(numero);

        // // ------------- OPERADOR DE INCREMENTO E DECREMENTO. ↓

        // int numero2 = 5;

        // // numero++;

        // System.out.println(++numero2); // Primeiro fará o incremento e depois
        // imprimirá o numero.

        // System.out.println(--numero2); // Primeiro fará o decremento e depois
        // imprimirá o numero.

        // // ------------- NEGAÇÃO COM VALOR BOOLEANO. ↓

        // boolean variavel = true;

        // System.out.println(!variavel); // Muda o valor booleano somente no print.

        // variavel = !variavel; // Realmente muda o valor booleano da variável.

        // System.out.println(variavel);

        // // ------------- OPERADOR DE CONDIÇÃO TERNÁRIA. ↓

        // // <Expressão Condicional> ? <Condição caso for true> : <Condição caso for
        // false>

        // int a, b;

        // a = 6;
        // b = 6;

        // String resultado = a == b ? "verdadeiro" : "falso"; // Utilizando como
        // String.

        // System.out.println(resultado);

        // int resultado2 = a == b ? 1 : 2; // Utilizando como inteiro.

        // System.out.println(resultado2);

        // // ------------- OPERADORES RELACIONAIS. ↓

        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // System.out.println("NumeroUm é igual a númeroDois? " + simNao);

        // if (numero1 < numero2) {
        // System.out.println("a nossa condição é verdadeira!");
        // }

        // simNao = numero1 != numero2;

        // System.out.println("NumeroUm é diferente de númeroDois? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("NumeroUm é maior que o númeroDois? " + simNao);

        // String nomeUm = "GLEYSON";
        // String nomeDois = new String("GLEYSON");

        // System.out.println(nomeUm.equals(nomeDois)); // Quando fizer comparação de
        // conteúdos/objetos utilizar sempre o método.equals().

        // // ------------- COMPARAÇÕES AVANÇADAS. ↓

        // String nome1 = "JAVA";
        // String nome2 = "JAVA";

        // System.out.println(nome1 == nome2); // true

        // String nome3 = new String("JAVA");

        // System.out.println(nome1 == nome3); // false

        // String nome4 = nome3;

        // System.out.println(nome3 == nome4); // true

        // // equals na parada
        // System.out.println(nome1.equals(nome2)); // ??
        // System.out.println(nome2.equals(nome3)); // ??
        // System.out.println(nome3.equals(nome4)); // ??

        // int numero1 = 130;
        // int numero2 = 130;
        // System.out.println(numero1 == numero2); //true

        // Integer numero3 = 130;
        // Integer numero4 = 130;

        // System.out.println(numero3 == numero4); //false

        // // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // // Como objetos a partir de agora.
        // // Qual a solução ?
        // // Quando queremos comparar objetos, usamos o método equals

        // System.out.println(numero3.equals(numero4));

        // // ------------- OPERADORES LÓGICOS. ↓

        // boolean condicao1 = true;

        // boolean condicao2 = false;

        // if (condicao1 && condicao2) {
        // System.out.println("As duas condições são verdadeiras.");
        // }

        // if (condicao1 || condicao2) {
        // System.out.println("Uma das condições são verdadeiras.");
        // }

        // if (condicao1 && (7 > 4)) {
        // System.out.println("As duas condições são verdadeiras.");
        // }

        // System.out.println("fim.");
    }
}
