import model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Reynaldo",37,82.5,'M',
                true);
        System.out.println(pessoa.toString());


    }
}