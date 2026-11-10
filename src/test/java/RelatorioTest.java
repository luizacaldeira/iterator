import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarClientesAtivosCarteira() {
        Carteira carteira = new Carteira(
                new Cliente("Ana", true),
                new Cliente("Empresa XPTO", true),
                new Cliente("Pedro", false),
                new Cliente("Maria", true)
        );
        assertEquals(3, Relatorio.contarClientesAtivosCarteira(carteira));
    }

    @Test
    void deveContarTotalClientesCarteira() {
        Carteira carteira = new Carteira(
                new Cliente("Ana", true),
                new Cliente("Empresa XPTO", true),
                new Cliente("Pedro", false),
                new Cliente("Maria", true)
        );
        assertEquals(4, Relatorio.contarTotalClientesCarteira(carteira));
    }

}