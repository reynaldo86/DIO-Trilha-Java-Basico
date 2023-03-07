# Map<>

### 
interface pública Map< K, V >
Um objeto que mapeia chaves para valores. Um mapa não pode conter chaves duplicadas; cada chave pode mapear para no máximo um valor.
Essa interface substitui o Dicionário qual classe era uma classe totalmente abstrata, e não uma interface.

O Map interface fornece três visualizações de coleção, qual permitir que o conteúdo de um mapa seja visto como um conjunto de chaves, coleção de valores, ou conjunto de mapeamentos de valor-chave. O ordem de um mapa é definido como a ordem em que os iteradores nas visualizações de coleção do mapa retornam seus elementos. Algumas implementações de mapas, como o TreeMap classe, faça garantias específicas quanto à sua ordem; outros, como o HashMap classe, não.


~~~ Java
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
    }       
}
~~~
Fonte:
[Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
