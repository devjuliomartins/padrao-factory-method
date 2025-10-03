# Padrão Factory Method

O **padrão Factory Method** é um padrão de projeto **criacional** que define uma **interface para criar objetos**, mas permite que as **subclasses decidam qual classe concreta instanciar**.  
Ele é útil quando o sistema precisa **criar objetos sem depender das classes concretas** e quer manter o **código flexível e extensível**.

No exemplo deste projeto, a `PagamentoFactory` cria diferentes tipos de pagamentos (`PagamentoPix`, `PagamentoCartao`, `PagamentoBoleto` e `PagamentoTransferencia`) sem que o cliente precise conhecer os detalhes de implementação de cada classe. Cada tipo de pagamento implementa a interface `IPagamento` com métodos como `pagar()` e `agendar()`.

## Quando usar Factory Method
- Quando você precisa **criar objetos de diferentes tipos** sem acoplar o código à classe concreta.  
- Quando quer **facilitar a adição de novos tipos** no futuro sem modificar o código existente.  
- Quando deseja que a **responsabilidade de criação de objetos** fique isolada em uma classe/factory específica.

### Como usar este projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/devjuliomartins/padrao-factory-method.git
