import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada>0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
                
            }
            System.out.println("Doce do  Valor: " + valorDoce + "Adicionado ao Carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou todo a sua mesada com Doce");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);

    }
}
