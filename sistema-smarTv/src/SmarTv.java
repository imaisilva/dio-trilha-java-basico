public class SmarTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 12;

    public void ligarTv(){
        ligada = true;
    }
    
    public void desligarTv(){
        ligada = false;
    }

    public void aumentaVolume(){
        volume++;
    }

    public void diminuiVolume(){
        volume--;
    }

    public void proximoCanal(){
        canal++;
    }

    public void canalAnterior(){
        canal--;
    }

    public void mudandoCanal(int novoCanal){
        canal = novoCanal;
    }
}
