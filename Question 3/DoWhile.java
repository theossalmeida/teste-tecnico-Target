
public class DoWhile {
    public static void main(String[] args) {
        int k = 0;
        int soma = 0;
        int indice = 12;

        do {
            k += 1;
            soma += k;
        } while (k < indice);

        System.out.println(soma);

    }
}