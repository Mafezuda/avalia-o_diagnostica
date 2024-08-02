public class Servico {
    private String tipo;
    private String preco;

    public Servico (String tipo, String preco ){
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo(){
        return tipo;
    }

    public String getPreco(){
        return preco;
    }
    
    public String toString(){
        return "Serviço [tipo = " + tipo + ", preço =" + preco + "]";
    }
}
