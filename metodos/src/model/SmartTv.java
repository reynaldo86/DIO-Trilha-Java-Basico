package model;

public class SmartTv {
    private String Marca;
    private int tamanho;
    private int volume;
    private int canal;

    public SmartTv() {
    }

    public SmartTv(String marca, int tamanho,int volume, int canal) {
        this.Marca = marca;
        this.tamanho = tamanho;
        this.volume = 25;
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar(boolean ligada){
        ligada = true;
    }
    public void desligada(boolean ligada){
        ligada = false;
    }
    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando o volume para "+volume);
    }
    public void diminuirVolume(){
        this.volume--;
        System.out.println("Diminuindo o volume para "+volume);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "Marca='" + Marca + '\'' +
                ", tamanho=" + tamanho +
                ", volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}
