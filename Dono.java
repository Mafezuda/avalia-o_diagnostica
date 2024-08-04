public class Dono {
    private String nome;
    private Veiculo veiculo;

    public Dono(String nome, Veiculo veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Dono [nome=" + nome + ", " + veiculo + "]";
    }
}
