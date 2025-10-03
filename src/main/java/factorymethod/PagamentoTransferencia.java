package factorymethod;

public class PagamentoTransferencia {

    public String pagar() {
        return "Transferencia efetivada";
    }

    public String agendar() {
        return "Transferencia agendada para outro dia útil";
    }
}
