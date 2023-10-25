import java.util.Date;

public class LancamentoExtrato {
    private long numeroCartao;
    private int quantidadePontos;
    private Date dataHoraLancamento;
    
    // Construtor
    public LancamentoExtrato(long numeroCartao, int quantidadePontos, Date dataHoraLancamento) {
        this.numeroCartao = numeroCartao;
        this.quantidadePontos = quantidadePontos;
        this.dataHoraLancamento = dataHoraLancamento;
    }
    
    // Métodos getter e setter para os atributos da classe
    public long getNumeroCartao() {
        return numeroCartao;
    }
    
    public int getQuantidadePontos() {
        return quantidadePontos;
    }
    
    public Date getDataHoraLancamento() {
        return dataHoraLancamento;
    }
}