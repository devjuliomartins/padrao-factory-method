package factorymethod;

public class PagamentoBoleto implements IPagamento {

    public String pagar() {
        return "Pagamento via Boleto efetivado";
    }

    public String agendar() {
        return "Pagamento via Boleto agendado";
    }
}
