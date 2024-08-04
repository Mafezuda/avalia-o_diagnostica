public class LavagemSimples extends Serviço {
    public LavagemSimples() {
        super("Lavagem Simples", 25.0);
    }

    @Override
    public void realizarServiço() {
        System.out.println("Realizando lavagem simples...");
    }
}

public class LavagemCompleta extends Serviço {
    public LavagemCompleta() {
        super("Lavagem Completa", 50.0);
    }

    @Override
    public void realizarServiço() {
        System.out.println("Realizando lavagem completa...");
    }
}

public class Polimento extends Serviço {
    public Polimento() {
        super("Polimento", 75.0);
    }

    @Override
    public void realizarServiço() {
        System.out.println("Realizando polimento...");
    }
}
