import model.SmartTv;

public class Main {
    public static void main(String[] args) {

        SmartTv tv = new SmartTv();
        tv.setMarca("Samsung");
        tv.setTamanho(40);
        tv.ligar(true);
        tv.setVolume(25);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.setCanal(9);
        tv.aumentarCanal();
        System.out.println(tv.toString());

    }
}