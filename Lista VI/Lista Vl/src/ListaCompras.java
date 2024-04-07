import java.util.List;
import java.util.ArrayList;

class ListaCompras {
    private List<String> itens;

    public ListaCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        this.itens.add(item);
    }

    public void removerItem(String item) {
        this.itens.remove(item);
    }

    public void exibirLista() {
        System.out.println("Lista de Compras:");
        for (String item : this.itens) {
            System.out.println("- " + item);
        }
        System.out.println();
    }
}
