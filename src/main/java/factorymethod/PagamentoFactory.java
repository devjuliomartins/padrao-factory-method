package factorymethod;

public class PagamentoFactory {

    public static IPagamento efetuarPagamento(String pagamento) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethod.Pagamento" + pagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Forma de Pagamento inexistente");
        }
        if (!(objeto instanceof IPagamento)) {
            throw new IllegalArgumentException("Forma de Pagamento inválido");
        }
        return (IPagamento) objeto;
    }
}
