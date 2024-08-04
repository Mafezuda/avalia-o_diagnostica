import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Serviço> serviços;
    private List<Dono> donos;
    private List<Pagamento> pagamentos;

    public Main() {
        serviços = new ArrayList<>();
        donos = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }

    public void adicionarServiço(Serviço serviço) {
        serviços.add(serviço);
    }

    public void registrarDono(Dono dono) {
        donos.add(dono);
    }

    public void registrarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void listarServiços() {
        System.out.println("Serviços disponíveis:");
        for (Serviço serviço : serviços) {
            System.out.println(serviço);
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

        lavaCar.adicionarServiço(new LavagemSimples());
        lavaCar.adicionarServiço(new LavagemCompleta());
        lavaCar.adicionarServiço(new Polimento());

        lavaCar.registrarDono(new Dono("João", new Veículo("ABC1234", "Fiat Uno")));
        lavaCar.registrarDono(new Dono("Maria", new Veículo("XYZ5678", "Ford Ka")));

        lavaCar.registrarPagamento(new Pagamento(lavaCar.donos.get(0), lavaCar.serviços.get(0)));
        lavaCar.registrarPagamento(new Pagamento(lavaCar.donos.get(1), lavaCar.serviços.get(1)));

        lavaCar.listarServiços();
        lavaCar.listarDonos();
        lavaCar.listarPagamentos();

        for (Serviço serviço : lavaCar.serviços) {
            serviço.realizarServiço();
        }
    }
}
