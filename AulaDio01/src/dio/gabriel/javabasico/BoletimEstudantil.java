package dio.gabriel.javabasico;


public class BoletimEstudantil {
    public static void main(String[] args){
        int mediaFinal = 6;
        if(mediaFinal < 6 )
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("Prova Recuperativa");
        else
            System.out.println("Aprovado");
    }
}
