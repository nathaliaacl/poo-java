public class Produto {
    static final short ALIMENTO = 1;
	static final short ELETRO = 2;
	static final short LIMPEZA = 3;
	static final short HIGIENE_PESSOAL = 4;
	
	long codigoEAN;
	String nome;
	short tipo;
	double preco;
	double aliquotaImposto;
	
	//construtor - construindo manualmente 
	//Produto(long codigoEAN, String nome){ 
		//diferenciacao de atributo e parametro 
		//this.codigoEAN = codigoEAN; 
		//this.nome = nome;
	//}
	
	public Produto(long codigoEAN, String nome, short tipo, double preco, double aliquotaImposto) {
		this.codigoEAN = codigoEAN;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.aliquotaImposto = aliquotaImposto;
	}

	boolean eTributavel(){
		return (tipo == 1 || tipo == 4) && preco < 10;
	}
	
	double calcularImposto(double redutor) {
		if(!eTributavel()) {
			return 0.0;
		}
		else {
			if(redutor < 0.0) {
				redutor = 0.0;
			}
			return preco*(aliquotaImposto - redutor)/100;
		}
	}
}