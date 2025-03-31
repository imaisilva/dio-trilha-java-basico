public class Usuario {

    public static void main(String[] args) {
        
        SmarTv smarTv = new SmarTv();

        System.out.println("Tv esta ligada? " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);

        System.out.println();

        smarTv.ligarTv();
        System.out.println("Ligando Tv: " + smarTv.ligada);

        smarTv.desligarTv();
        System.out.println("Desligando Tv: " + smarTv.ligada);

        System.out.println();

        System.out.println("Volume atual: " + smarTv.volume);
        smarTv.aumentaVolume();
        System.out.println("Aumentando volume: " + smarTv.volume);

        System.out.println();

        System.out.println("Volume atual: " + smarTv.volume);
        smarTv.diminuiVolume();
        System.out.println("Diminuindo volume: " + smarTv.volume);

        System.out.println();

        System.out.println("Canal atual: " + smarTv.canal);
        smarTv.proximoCanal();
        System.out.println("Proximo canal: " + smarTv.canal);

        System.out.println();

        System.out.println("Canal atual: " + smarTv.canal);
        smarTv.canalAnterior();
        System.out.println("Canal anteior: " + smarTv.canal);

        System.out.println();

        System.out.println("Canal atual: " + smarTv.canal);
        smarTv.mudandoCanal(16);
        System.out.println("Mudando canal: " + smarTv.canal);
    }
    
}
