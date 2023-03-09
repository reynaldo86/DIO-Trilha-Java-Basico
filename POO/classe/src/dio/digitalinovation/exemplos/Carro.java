package dio.digitalinovation.exemplos;

public class Carro extends Veiculo{
    private String modelo;
    private String cor;
    private int capacidadeTanque;

    //Constructor
    public Carro() {
    }

    public Carro(String modelo, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Get and Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    //Method
    public double encherTanque(double valor){

        return this.capacidadeTanque * valor;
    }



    @Override
    public String toString() {
        return "Carro{" +
                "\nmodelo = '" + modelo + '\'' +
                ",\ncor = '" + cor + '\'' +
                ",\ncapacidadeTanque = " + capacidadeTanque +
                '}';
    }
}
