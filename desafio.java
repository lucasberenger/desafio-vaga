public class DesafiosTecnicos {

    public static void main(String[] args) {
        // Desafio 1: Cálculo da SOMA.
        desafio1();

        // Desafio 2: Verificar se um número pertence à sequência de Fibonacci.
        desafio2(21); // Substitua por outro número de sua preferência.

        // Desafio 3: Cálculo de menor, maior e dias acima da média.
        desafio3();

        // Deasfio 4: Percentual de representação por estado.
        desafio4();

        // Desafio 5: Inverter string.
        desafio5("Exemplo de String"); // Insira a string que deseja inverter.
    }

    // Desafio 1
    public static void desafio1() {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Valor final da SOMA: " + SOMA);
    }

    // Desafio 2
    public static void desafio2(int numero) {
        int a = 0, b = 1, soma;
        boolean pertence = false;

        while (a <= numero) {
            if (a == numero) {
                pertence = true;
                break;
            }
            soma = a + b;
            a = b;
            b = soma;
        }

        System.out.println("O número " + numero + (pertence ? " pertence" : " não pertence") + " à sequência de Fibonacci.");
    }

    // Desafio 3
    public static void desafio3() {
        //faturamento em JSON
        double[] faturamento = {0, 200, 300, 0, 100, 400, 0, 0, 500, 300, 700, 0, 0};
        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0;
        int diasValidos = 0;

        for (double valor : faturamento) {
            if (valor > 0) { 
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                soma += valor;
                diasValidos++;
            }
        }

        double media = soma / diasValidos;
        int diasAcimaDaMedia = 0;

        for (double valor : faturamento) {
            if (valor > media) diasAcimaDaMedia++;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
    }

    // Desafio 4
    public static void desafio4() {
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        double total = sp + rj + mg + es + outros;

        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", (sp / total) * 100);
        System.out.printf("RJ: %.2f%%\n", (rj / total) * 100);
        System.out.printf("MG: %.2f%%\n", (mg / total) * 100);
        System.out.printf("ES: %.2f%%\n", (es / total) * 100);
        System.out.printf("Outros: %.2f%%\n", (outros / total) * 100);
    }

    // Desafio 5
    public static void desafio5(String texto) {
        char[] caracteres = texto.toCharArray();
        String invertida = "";

        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }

        System.out.println("String invertida: " + invertida);
    }
}
