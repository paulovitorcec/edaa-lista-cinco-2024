import java.util.ArrayList;
import java.util.List;

class ListaDeContatos implements iMetodos {
    private List<String> nomes;
    private List<String> telefones;

    public ListaDeContatos() {
        this.nomes = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        this.nomes.add(nome);
        this.telefones.add(telefone);
    }

    public String buscarContato(String nome) {
        for (int i = 0; i < this.nomes.size(); i++) {
            if (this.nomes.get(i).equals(nome)) {
                return this.telefones.get(i);
            }
        }
        return "Contato não encontrado.";
    }

    public void listarContatos() {
        for (int i = 0; i < this.nomes.size(); i++) {
            System.out.println("Nome: " + this.nomes.get(i) + ", Telefone: " + this.telefones.get(i));
        }
    }
}
