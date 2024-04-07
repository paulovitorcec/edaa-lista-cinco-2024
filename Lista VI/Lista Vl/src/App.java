import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ListaDeContatos listaContatos = new ListaDeContatos();
        listaContatos.adicionarContato("João", "123456789");
        listaContatos.adicionarContato("Maria", "987654321");
        listaContatos.adicionarContato("Paulo", "86036446");

        System.out.println("Contato de João: " + listaContatos.buscarContato("João"));
        System.out.println("Contato de Maria: " + listaContatos.buscarContato("<Maria>"));
        System.out.println("Contato de Paulo: "+listaContatos.buscarContato("Paulo"));
        System.out.println("\nLista de Contatos:");
        listaContatos.listarContatos();

        ListaCompras listaCompras = new ListaCompras();
        listaCompras.adicionarItem("Arroz");
        listaCompras.adicionarItem("Feijão");
        listaCompras.adicionarItem("Macarrão");

        System.out.println("Lista de Compras antes da remoção:");
        listaCompras.exibirLista();

        listaCompras.removerItem("Feijão");

        System.out.println("Lista de Compras após a remoção:");
        listaCompras.exibirLista();

                List<Animal> listaAnimais = new ArrayList<>();
                listaAnimais.add(new Animal("Jacaré"));
                listaAnimais.add(new Animal("Leão"));
                listaAnimais.add(new Animal("Girafa"));
                listaAnimais.add(new Animal("Elefante"));
                listaAnimais.add(new Animal("Zebra"));
                listaAnimais.add(new Animal("Cachorro"));
                listaAnimais.add(new Animal("Gato"));
                listaAnimais.add(new Animal("Cobra"));
                listaAnimais.add(new Animal("Morcego"));
        
                Collections.sort(listaAnimais, (animal1, animal2) -> animal1.getNome().compareTo(animal2.getNome()));
        
                for (Animal animal : listaAnimais) {
                    System.out.println(animal.getNome());

                    List<Pais> listaPaises = new ArrayList<>();
            listaPaises.add(new Pais("Brasil"));
            listaPaises.add(new Pais("Argentina"));
            listaPaises.add(new Pais("Chile"));
            listaPaises.add(new Pais("Uruguai"));
            listaPaises.add(new Pais("Portugal"));
            listaPaises.add(new Pais("Bolivia"));
            listaPaises.add(new Pais("China"));
            listaPaises.add(new Pais("Estados Unidos"));
            listaPaises.add(new Pais("França"));
            listaPaises.add(new Pais("Japão"));
            listaPaises.add(new Pais("Coréia"));

        Collections.sort(listaPaises, (pais1, pais2) -> pais1.getNome().compareTo(pais2.getNome()));

        for (Pais pais : listaPaises) {
            System.out.println(pais.getNome());
                }
            }

            List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 20));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Daniel", 31));
        pessoas.add(new Pessoa("Lucas", 18));

    
        bubbleSortPorIdade(pessoas);

        System.out.println("As pessoas foram ordenadas por idade:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public static void bubbleSortPorIdade(List<Pessoa> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).getIdade() > lista.get(j + 1).getIdade()) {
                    Pessoa temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }
}