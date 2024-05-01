import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int contador = 1;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println(contador + " - Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
            contador++;
        }
        System.out.println("Mesada restante: R$ " + mesada);
        System.out.println("Quantidade de doces comprados: " + contador);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}