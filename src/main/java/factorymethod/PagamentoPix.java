package factorymethod;

public class PagamentoPix implements IPagamento {

    public String pagar() {
        return "Pagamento via Pix efetivado";
    }

    public String agendar() {
        return "Pix não permite agendamento";
    }
}
