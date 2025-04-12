
package Encapsulamento;

public class Teste {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        
       // f.nome = "Rafael Consentino"; //sem encapsulamento
        f.setNome("Rafael Consentino"); //com encapsulamento
       // f.salario = 2000; //sem encapsulamento
        f.setSalario(2000); //com encapsulamento
        
        System.out.println(f.getNome()); // com encapsulamento
        System.out.println(f.getSalario()); // com encapsulamento
        
    }
    
}
