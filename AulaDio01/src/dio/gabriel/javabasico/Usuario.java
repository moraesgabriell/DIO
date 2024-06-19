package dio.gabriel.javabasico;

public class Usuario {
    public static void main(String[] args) throws Exception{

        ExercicioTv smartTv = new ExercicioTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume Atual" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Desligando a Tv..." + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentando o Volume da Smart Tv" + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();


        System.out.println("Diminuindo o volume da SmartTv..." + smartTv.volume);

        smartTv.mudarCanal(13);

        System.out.println("Novo canal da TV é:" + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal da TV é : " + smartTv.canal);
    }


}
//public acessa de qualquer classe
//private acesso apenas de dentro da classe
//protected acesso por herança
