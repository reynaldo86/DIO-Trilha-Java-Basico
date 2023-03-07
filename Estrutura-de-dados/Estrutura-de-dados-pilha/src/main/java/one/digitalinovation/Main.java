package one.digitalinovation;

public class Main {
    public static void main(String[] args) {

        Pilha minhapilha = new Pilha();

        minhapilha.push(new No(1));
        minhapilha.push(new No(2));
        minhapilha.push(new No(3));
        minhapilha.push(new No(4));
        minhapilha.push(new No(5));
        minhapilha.push(new No(99));

        System.out.println(minhapilha);

        System.out.println(minhapilha.pop());

        System.out.println(minhapilha);

    }
}
