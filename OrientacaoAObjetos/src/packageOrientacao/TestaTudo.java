package packageOrientacao;

public class TestaTudo {

    public static void main(String[] args) {
       // Instância dos objetos 
       Agencia a1 = new Agencia();
       Cliente c1 = new Cliente();
       Conta co1 = new Conta();
       CartaoDeCredito cdc1 = new CartaoDeCredito();
       
       //Atribuição de valores 
       c1.codigo = 1;
       c1.nome = "Gabriel Vilanova";
       a1.numero = 1234;
       
       co1.numero = 1234;
       co1.saldo = 1000;
       co1.limite = 500;
       
       cdc1.numero = 1111;
       cdc1.dataDeValidade = "01/01/2028";
       
       // Printando os objetos 
       System.out.println("Agencia: " + a1.numero);
       System.out.println("Codigo do Cliente: " + c1.codigo);
       System.out.println("Nome do Cliente: " + c1.nome);
       System.out.println("Numero da Conta do Cliente: " + co1.numero);
       System.out.println("Saldo da Conta do Cliente: " + co1.saldo);
       System.out.println("Limite da Conta do Cliente: " + co1.limite);
       System.out.println("Numero do Cartao de Crédito do Cliente: " + cdc1.numero);
       System.out.println("Data de validade do Cartao de Crédito do Cliente: " + cdc1.dataDeValidade);
       


       
    }
    
}
