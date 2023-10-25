public class ContaBanco2 {
    public static void main(String[] args){
      // Correntista cor = new Correntista(1, "Eduardo");
      ContaBanco c1 = new ContaBanco();
      ContaBanco c2 = new ContaBanco();
      c2.creditar(100.0);
      System.out.println(c1.saldo);
      System.out.println(c2.saldo);
      c1.creditar(10.0);
      System.out.println(c1.saldo);
      c1.debitar(5.0);
      System.out.println(c1.saldo);
    }
}
