public class LavagemSimples extends Servico {
    public LavagemSimples() {
        super("Lavagem Simples", 25.0);
    }

    @Override
    public void realizarServico() {
        System.out.println("Realizando lavagem simples...");
    }
}

public class LavagemCompleta extends Servico {
    public LavagemCompleta() {
        super("Lavagem Completa", 50.0);
    }

    @Override
    public void realizarServico() {
        System.out.println("Realizando lavagem completa...");
    }
}

public class Polimento extends Servico {
    public Polimento() {
        super("Polimento", 75.0);
    }

    @Override
    public void realizarServico() {
        System.out.println("Realizando polimento...");
    }
}
