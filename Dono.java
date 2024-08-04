public class Dono {
    private String nome;
    private Veículo veículo;

    public Dono(String nome, Veículo veículo) {
        this.nome = nome;
        this.veículo = veículo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veículo getVeículo() {
        return veículo;
    }

    public void setVeículo(Veículo veículo) {
        this.veículo = veículo;
    }

    @Override
    public String toString() {
        return "Dono [nome=" + nome + ", " + veículo + "]";
    }
}
