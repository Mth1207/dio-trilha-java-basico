public class ExemploForArray {

    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // // UTILIZANDO FOR COM ARRAY TRADICIONAL. ↓
        // for (int i = 0; i < alunos.length; i++) {
        // System.out.println("O aluno do indice i=" + i + " é " + alunos[i]);
        // }

        // UTILIZANDO FOR EACH PARA O MESMO ARRAY. ↓
        // ForEach é fortemente utilizando com um cenário que contenha arrays ou
        // coleções!
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        // TESTANDO COM NÚMEROS. ↓
        for (int numero : numeros) {
            System.out.println("Número no array: " + numero);
        }
    }
}
