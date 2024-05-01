public class ExemploBreakContinue {
    public static void main(String[] args) {
        // // EXEMPLO UTILIZANDO O BREAK. ↓
        // for (int numero = 1; numero <= 5; numero++) {
        // if (numero == 3)
        // break;

        // System.out.println(numero);
        // /* A saída será somente 1 e 2, porque esse bloco if com o break esta antes do
        // * print e a condição do if é igual a 3. */
        // }

        // EXEMPLO UTILIZANDO O CONTINUE. ↓
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);
            /*
             * Utilizando o continue, será impresso 1, 2, 4 e 5. Porque quando numero == 3
             * ele pula a próxima instrução do for e retorna para o laço de repetição.
             */
        }
    }
}
