public class ResultadoEscolar {

    //Condicional Encadeada
    public static void main(String[] args) {
      /*   int nota = 6;

        if (nota >= 7){
            System.out.println("Aprovado");
        }

        else if(nota >=5 && nota < 7 ){
            System.out.println("Recuperação");
        }

        else{
            System.out.println("Reprovado");
        } */

        //Condição Ternária

        int nota = 7;
        String Resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(Resultado);

        
    }
}
