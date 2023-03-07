# Equals()

### Equals é um método da classe lang.Object usado para comparar dois objetos. Portanto, esse trecho de código retornará true, certo?

~~~ Java
public class App {
    public static void main(String[] args) throws Exception {
        Produto notebook1 = new Produto("Acer Nitro 5 Intel", 4000.0);
        Produto notebook2 = new Produto("Acer Nitro 5 Intel", 4000.0);

        System.out.println(celular1.equals(celular2));
    }
}
~~~

