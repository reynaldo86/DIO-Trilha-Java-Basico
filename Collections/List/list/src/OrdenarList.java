import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarList {
    public static void main(String[] args) {
        List<Gato> gatoList = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Eve", 7, "Malhado"));
            add(new Gato("Titela", 6, "Cinza"));
        }};

        // Imprime pela ordem que é inserido.
        System.out.println("--\tOrdem de Inserção\t---");
        for (Gato gatos : gatoList) {
            System.out.println(gatos);
        }

        //Imprime em ordem aleatória
        System.out.println("--\tOrdem de Aleatória\t---");
        Collections.shuffle(gatoList);
        System.out.println(gatoList.toString());

        //Imprime na ordem natural
        System.out.println("--\tOrdem de Natural\t---");
        Collections.sort(gatoList);
        System.out.println(gatoList);

        //Imprime os gatos por ordem de idade.
        Collections.sort(gatoList, new ComparatorIdade());
        System.out.println(gatoList);

        //Imprime na ordem de cor
        System.out.println("--\tOrdem de Cor\t---");
        gatoList.sort(new ComparatorCor());
        System.out.println(gatoList);

        /*Imprime por odem alfabetica por nome se nao existe nomes iguais
        se existir nomes iguais coloca em ordem alfabetica por cor, se inao existir cores iguais.
        se existir cores iguais imprime em ordem crescente por idade.
         */

        System.out.println("--\tOrdem por Nome ou Cor ou Idade.\t---");
        gatoList.sort(new ComparatorNomeCorIdade());
        System.out.println(gatoList);


    }



}
     class Gato implements Comparable<Gato>{
        private String nome;
        private Integer idade;
        private String cor;

        public Gato(String nome, int idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

         @Override
         public String toString() {
             return "Gato{\n" +
                     "\nnome='" + nome + '\'' +
                     ",\nidade=" + idade +
                     ",\ncor='" + cor + '\'' +
                     '}';
         }

         @Override
         public int compareTo(Gato gato) {
             return this.getNome().compareToIgnoreCase(gato.getNome());
         }
     }

//Comparator de idade
class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

//Comparator pela cor.
class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
//Compara nome cor e idade
class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0){
            return nome;
        }
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0 ){
            return cor;
        }else{
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}

