public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 30.0;
        double valorSolicitado = 14.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
        }
        System.out.println(saldo);
    }
}
