package Sobreescrita.ModificadorFinal.Cliente;

public enum TipoCliente {
    PESSOA_FISICA (1, "Pessoa Fisíca"),
    PESSOA_JURIDICA (2, "Pessoa Juridica");
    
    private final int VALOR;
    private String tipoClienteRelatorio;

    private TipoCliente (int valor, String tipoClienteRelatorio) {
        this.VALOR = valor;
        this.tipoClienteRelatorio = tipoClienteRelatorio;
    }

    public int getValor() { return VALOR; }

    public String getTipoClienteRelatorio() { return tipoClienteRelatorio; }

    public static TipoCliente tipoClientePorNomeRelatorio (String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getTipoClienteRelatorio().equals(nomeRelatorio)) { return tipoCliente; }
        }
        return null;
    }
}