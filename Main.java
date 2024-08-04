import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Servico> servicos;
    private List<Dono> donos;
    private List<Pagamento> pagamentos;

    public Main() {
        servicos = new ArrayList<>();
        donos = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void registrarDono(Dono dono) {
        donos.add(dono);
    }

    public void registrarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void listarServicos() {
        System.out.println("Serviços disponíveis:");
        for (Servico servico : servicos) {
            System.out.println(servico);
        }
    }

    public void listarDonos() {
        System.out.println("Donos registrados:");
        for (Dono dono : donos) {
            System.out.println(dono);
        }
    }

    public void listarPagamentos() {
        System.out.println("Pagamentos registrados:");
        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento);
        }
    }

    public static void main(String[] args) {
        Main lavaCar = new Main();

        lavaCar.adicionarServico(new LavagemSimples());
        lavaCar.adicionarServico(new LavagemCompleta());
        lavaCar.adicionarServico(new Polimento());

        lavaCar.registrarDono(new Dono("João", new Veiculo("ABC1234", "Fiat Uno")));
        lavaCar.registrarDono(new Dono("Maria", new Veiculo("XYZ5678", "Ford Ka")));

        lavaCar.registrarPagamento(new Pagamento(lavaCar.donos.get(0), lavaCar.servicos.get(0)));
        lavaCar.registrarPagamento(new Pagamento(lavaCar.donos.get(1), lavaCar.servicos.get(1)));

        lavaCar.listarServicos();
        lavaCar.listarDonos();
        lavaCar.listarPagamentos();

        for (Servico servico : lavaCar.servicos) {
            servico.realizarServico();
        }
    }
}
