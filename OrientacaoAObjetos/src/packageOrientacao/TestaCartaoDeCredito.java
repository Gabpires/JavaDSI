package packageOrientacao;

public class TestaCartaoDeCredito {

    public static void main(String[] args) {
      //Instância do primeiro objeto
      CartaoDeCredito cdc1 = new CartaoDeCredito();
      
      //Atribuição de Valores 
      cdc1.numero = 1111;
      cdc1.dataDeValidade = "01/01/2025";
      
      // Instãncia do segundo objeto
      CartaoDeCredito cdc2 = new CartaoDeCredito();
      cdc2.numero = 2222;
      cdc2.dataDeValidade = "01/01/2027";
      
      //Printando os resultados
      System.out.println(cdc1.numero);
      System.out.println(cdc1.dataDeValidade);
      
      System.out.println(cdc2.numero);
      System.out.println(cdc2.dataDeValidade);
      
    }
    
}
