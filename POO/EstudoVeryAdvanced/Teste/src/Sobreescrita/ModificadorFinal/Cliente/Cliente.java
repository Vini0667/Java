package Sobreescrita.ModificadorFinal.Cliente;

public class Cliente {
    public enum TipoPagamento {
        DEBITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * .1;
            }
        },
        CREDITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * .05;
            }
        };

        public abstract double calcularDesconto (double valor);
    }
    
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente.getTipoClienteRelatorio() + ", tipoPagamento=" + tipoPagamento + "]";
    } 
}