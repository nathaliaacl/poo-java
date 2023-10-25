public class DefinicaoClasses {
    long matricula;
    String nome;
    int idade;
    char sexo;
    double salario_bruto;

    boolean eIdoso(){
		return (idade >= 60);
	}

    double salarioLiquido(double AP, double AIR){ //o que nao esta como atributo, passamos como parametro
        if (!eIdoso()){
            return (1 - (AP/100) - (AIR/100))*salario_bruto;
        }
        else{
            return (1 - (AP/100) - (0.8*AIR)/100)*salario_bruto;
        }
    }
}