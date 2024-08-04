public abstract class Serviço {
    private String tipo;
    private double preco;

    public Serviço(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Serviço [tipo=" + tipo + ", preço=" + preco + "]";
    }

    public abstract void realizarServiço();
}
