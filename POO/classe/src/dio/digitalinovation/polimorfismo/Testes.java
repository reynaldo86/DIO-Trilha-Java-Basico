package dio.digitalinovation.polimorfismo;

public class Testes {
    public static void main(String[] args) {

        //Sobrescrita ccom o polimofismo com a classe mãe.
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for(ClasseMae classe: classes){
            classe.metodo1();
        }
        System.out.println(" ");


        for(ClasseMae classe: classes){
            classe.metodo2();
        }
        System.out.println(" ");

        //Sobrescrita, trabalhando diretamente com a classe filha.
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
