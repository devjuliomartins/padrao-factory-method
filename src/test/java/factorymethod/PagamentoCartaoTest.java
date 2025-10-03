package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PagamentoCartaoTest {

    @Test
    void devePagarCartao() {
        IPagamento pagamento = PagamentoFactory.efetuarPagamento("Cartao");
        assertEquals("Pagamento via Cartão efetivado", pagamento.pagar());
    }

    @Test
    void deveAgendarCartao() {
        IPagamento pagamento = PagamentoFactory.efetuarPagamento("Cartao");
        assertEquals("Pagamento via Cartão agendada", pagamento.agendar());
    }
}
