package padroescriacao.abstractfactory;

public class FabricaJapones implements FabricaRestaurante {
    @Override
    public Prato createPrato() {
        return new PratoJapones();
    }
    @Override
    public Bebida createBebida() {
        return new BebidaJaponesa();
    }
}