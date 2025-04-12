package packageOrientacao;

public class TestaGerente {

    public static void main(String[] args) {
       Gerente g = new Gerente();
       
       g.salario = 1000;
       
       System.out.println("Salário R$ " + g.salario);
       
       System.out.println("aumentando o salário em 10%");
       g.aumentaSalario();
       
       System.out.println("Salário com 10% R$ " + g.salario);
       
       System.out.println("aumentando o salário em 30%");
       g.aumentaSalario(0.3);
       
       System.out.println("Salário com 30% R$ " + g.salario);
       
    }
    
}
