import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome","João");
        aluno.put("Idade","18");
        aluno.put("Media","8.6");
        aluno.put("Turma","3a");

        System.out.println(aluno);

        //.keySet() Retorna as key do map
        System.out.println(aluno.keySet());

        //.values retorna os valores de cada key
        System.out.println(aluno.values());

        //Criando uma lista de alunos
        List<Map<String, String>> listaAlunos = new ArrayList<>();

        //.add() adiciona o intem a lista
        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome","Maria");
        aluno2.put("Idade","15");
        aluno2.put("Media","9.6");
        aluno2.put("Turma","3a");

        //.add() adiciona o intem a lista
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        //Retorna a lista de alunos
        for ( Map<String, String> alunos: listaAlunos) {
            System.out.println(alunos);

        }

        //.containsKey verifica se existe o campo passado por parametro.
        System.out.println(aluno.containsKey("Nome"));
    }
}