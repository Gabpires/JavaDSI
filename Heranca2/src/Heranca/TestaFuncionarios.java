package Heranca;


public class TestaFuncionarios {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        //Classe Funcionario mãe)
        g.setNome("Marcos Costa");
        g.setSalario(32450.22);
        
        //Classe Filha (Funcionario)
        g.setUsuario("marcão");
        g.setSenha("batatinha");
        
        Telefonista t = new Telefonista();
        //Classe Telefonista (mãe)
        t.setNome("Eliane Prado");
        t.setSalario(10780.23);
        
        //Classe Filha (Telefonista)
        t.setEstacaoDeTrabalho(12);
        
        Secretaria s = new Secretaria();
        //Classe Funcionario (mãe)
        s.setNome("Nilva Prado");
        s.setSalario(6550.99);
        
        //Classe Filha (Secretaria)
        s.setRamal (6677);
        
        //Mostrar os dados Gerente
        System.out.println("====================");
        System.out.println("Gerente:");
        g.mostrarDados();
        
        //Mostrat os dados Telefonista
        System.out.println("====================");
        System.out.println("Telefonista:");
        t.mostrarDados();

        //Mostrar os dados Secretaria
        System.out.println("====================");
        System.out.println("Secretaria:");
        s.mostrarDados();

        
    }
    
}
