public class Dono {
    private String nome;
    private String veiculo;

    public Dono(String nome, String veiculo){
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public String getNome(){
        return nome;
    }

    public String getVeiculo(){
        return veiculo;
    }

    public String toString(){
        return "Dono [nome = " + nome + ", veículo =" + veiculo + "]";
    }
    
}
