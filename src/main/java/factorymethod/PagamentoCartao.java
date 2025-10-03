package factorymethod;

public class PagamentoCartao implements IPagamento{

    public String pagar() {
        return "Pagamento via Cartão efetivado";
    }

    public String agendar() {
        return "Pagamento via Cartão agendada";
    }
}
