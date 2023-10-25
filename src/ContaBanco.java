public class ContaBanco {
    double saldo; 
    Correntista correntista;

    void creditar(double valor){
        saldo = saldo + valor;
    }
    boolean debitar (double valor){
        if((saldo - valor) >= 0){
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    void setarNomeCorrentista(String nome){
        correntista.nome = nome;
    }
}
//atribuindo q a pessoa nao pode ter saldo negativo 