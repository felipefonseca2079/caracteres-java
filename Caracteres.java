public class Caracteres {
    public static void main(String[] args) {
        // Criação de um array de char com 256 elementos
        char[] arrayCaracteres = new char[256];

        // Preenchimento do array com os valores de 0 a 255
        for (int i = 0; i < 256; i++) {
            arrayCaracteres[i] = (char) i;
        }

        // Impressão dos elementos, um por linha
        for (int i = 0; i < 256; i++) {
            System.out.println((int) arrayCaracteres[i]);
        }
    }
}