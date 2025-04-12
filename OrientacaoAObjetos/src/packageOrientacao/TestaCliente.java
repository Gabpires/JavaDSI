package packageOrientacao;
        

  
public class TestaCliente {

    public static void main(String[] args) {
        //Instância do primeiro objeto
        Cliente c1 = new Cliente();
        
        //atribuindo valores 
        c1.codigo = 1;
        c1.nome = "Marcos Costa";
        
        //Instância do segundo objeto
        Cliente c2 = new Cliente();
        
        //Atribuindo valores
        c2.codigo = 2;
        c2.nome = "Eliane Prado";
        
        //Printando o conteúdo
        System.out.println(c1.codigo);
        System.out.println(c1.nome);
        
        System.out.println(c2.codigo);
        System.out.println(c2.nome);
        
        
    }
    
}

