package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioPedido {

    @Test
    public void testPratoJapones() {
        Pedido pedido = new Pedido(new FabricaJapones());
        assertEquals("Sushi", pedido.servirPrato());
    }

    @Test
    public void testBebidaJaponesa() {
        Pedido pedido = new Pedido(new FabricaJapones());
        assertEquals("Sake", pedido.servirBebida());
    }
}