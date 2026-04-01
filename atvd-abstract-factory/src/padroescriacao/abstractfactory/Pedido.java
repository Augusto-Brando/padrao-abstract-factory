package padroescriacao.abstractfactory;

public class Pedido {
    private Prato prato;
    private Bebida bebida;

    public Pedido(FabricaRestaurante fabrica) {
        this.prato = fabrica.createPrato();
        this.bebida = fabrica.createBebida();
    }

    public String servirPrato() {
        return this.prato.servir();
    }

    public String servirBebida() {
        return this.bebida.servir();
    }
}