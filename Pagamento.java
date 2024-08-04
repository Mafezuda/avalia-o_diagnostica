public class Pagamento {
    private Dono dono;
    private Servico servico;
    private double valor;

    public Pagamento(Dono dono, Servico servico) {
        this.dono = dono;
        this.servico = servico;
        this.valor = servico.getPreco();
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento [dono=" + dono.getNome() + ", serviço=" + servico.getTipo() + ", valor=" + valor + "]";
    }
}
