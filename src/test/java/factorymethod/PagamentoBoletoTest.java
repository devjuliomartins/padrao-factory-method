package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoBoletoTest {

    @Test
    void devePagarBoleto() {
        IPagamento pagamento = PagamentoFactory.efetuarPagamento("Boleto");
        assertEquals("Pagamento via Boleto efetivado", pagamento.pagar());
    }

    @Test
    void deveAgendarBoleto() {
        IPagamento pagamento = PagamentoFactory.efetuarPagamento("Boleto");
        assertEquals("Pagamento via Boleto agendado", pagamento.agendar());
    }

}