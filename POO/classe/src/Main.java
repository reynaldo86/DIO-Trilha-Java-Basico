import dio.digitalinovation.exemplos.Carro;
import dio.digitalinovation.oo.dio.digitalinovation.exercicio.Faxineiro;
import dio.digitalinovation.oo.dio.digitalinovation.exercicio.Funcionario;
import dio.digitalinovation.oo.dio.digitalinovation.exercicio.Gerente;
import dio.digitalinovation.oo.dio.digitalinovation.exercicio.Vendedor;

public class Main {
    public static void main(String[] args) {
        //Metodo especial
        Carro carro1 = new Carro();

        carro1.setModelo("Prisma");
        carro1.setCor("Preto");
        carro1.setCapacidadeTanque(54);

        System.out.println(carro1);
        System.out.println("Valor para encher o tanque R$ " + carro1.encherTanque(5.40));

        //Upcasts e dowcasts.
       Funcionario funcionario = new Funcionario();

       //Upcast
       Funcionario gerente = new Gerente();
       Funcionario vendedor = new Vendedor();
       Funcionario faxineiro = new Faxineiro();

       //Downcast
        Vendedor vendedor1 = (Vendedor) new Funcionario();


    }
}