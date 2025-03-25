
package ExercicioMetodos;


public class Funcionario {
    String nome;
    double salario;
    
    void aumentaSalario (double valor) {
        this.salario += valor;
}
    void consultaDadosFuncionarios () {
       System.out.println("nome do Funcionário: " + this.nome);
       System.out.println("Novo Salário do Funcionário: " + this.salario);
    }
}

