package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPagamentoInexistente() {
        try {
            IPagamento pagamento = PagamentoFactory.efetuarPagamento("Tampinha");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de Pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInvalido() {
        try {
            IPagamento pagamento = PagamentoFactory.efetuarPagamento("Transferencia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de Pagamento inválido", e.getMessage());
        }
    }
}