import javax.swing.JOptionPane;

public class Jogador {
    String nome, CPF;
    int pontuacao;
    
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public Jogador(String nome, String cPF) {
        this.nome = nome;
        CPF = cPF;
    }

    public Jogador (String nome, String cPF, int pontuacao) {
        if (pontuacao < 0)
        {
            JOptionPane.showMessageDialog (null, "Erro: A pontuação posta " + pontuacao + " é menor que zero\nAssim será atribuido o valor zero.", "ERRO", JOptionPane.ERROR_MESSAGE);
            this.pontuacao = 0;
        }
        else
            this.pontuacao = pontuacao;
  
        this.nome = nome;
        CPF = cPF;
    }
    
    public int fazPonto () {
        return ++pontuacao;
    }

    public void imprimeDados () {
        JOptionPane.showMessageDialog(null, "Os dados do jogador caro são\nNome: " + nome + "\nCPF: " + CPF + "\npontuação: " + pontuacao, "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}