package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoPixTest {

    @Test
    void devePagarPix() {
        IPagamento servico = PagamentoFactory.efetuarPagamento("Pix");
        assertEquals("Pagamento via Pix efetivado", servico.pagar());
    }

    @Test
    void deveAgendarPix() {
        IPagamento servico = PagamentoFactory.efetuarPagamento("Pix");
        assertEquals("Pix não permite agendamento", servico.agendar());
    }

}