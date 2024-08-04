public class Pagamento {
    private Dono dono;
    private Serviço serviço;
    private double valor;

    public Pagamento(Dono dono, Serviço serviço) {
        this.dono = dono;
        this.serviço = serviço;
        this.valor = serviço.getPreco();
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public Serviço getServiço() {
        return serviço;
    }

    public void setServiço(Serviço serviço) {
        this.serviço = serviço;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento [dono=" + dono.getNome() + ", serviço=" + serviço.getTipo() + ", valor=" + valor + "]";
    }
}
