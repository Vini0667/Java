package Sobreescrita.ModificadorFinal.Cliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Enzo", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente1 = new Cliente("Jão", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(Cliente.TipoPagamento.DEBITO.calcularDesconto (100));
        System.out.println(Cliente.TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente01 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisía");

        System.out.println(tipoCliente01);
    }
}