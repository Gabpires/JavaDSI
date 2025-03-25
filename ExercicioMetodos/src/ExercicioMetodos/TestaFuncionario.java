
package ExercicioMetodos;

public class TestaFuncionario {

  
    public static void main(String[] args) {
        //Criando novos objetos
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        //atribuição de valores
        f1.nome = "Gabriel Vilanova";
        f1.salario = 1530;
        
        f2.nome = "Sandra Marcondes";
        f2.salario = 8000;
        
        //imprimindo valores atribuidos
        System.out.println("Nome do Funcionário: " + f1.nome);
        System.out.println("Seu salário é de: " + f1.salario);
        
        System.out.println("Nome do Funcionário: " + f2.nome);
        System.out.println("Seu salário é de: " + f2.salario);
        
        //chamando os métodos
        f1.aumentaSalario(1000);
        f1.consultaDadosFuncionarios();
        
        f2.aumentaSalario(500);
        f2.consultaDadosFuncionarios();
        
    }
    
}
