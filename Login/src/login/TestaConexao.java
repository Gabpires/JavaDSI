package login;

public class TestaConexao {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.abrirConexao(); //Chamando o método de abertura da conexão com o bd
        
        try {
            Thread.sleep(4000); //Faz um pausa de 4 segundos
            c.fecharConexao(); // Fechando a conexão      
        } catch (InterruptedException ex) {
            // Mensagem de saída caso haja erro
            System.out.println("Houve algum problema no teste de conexão" + ex.getMessage());
        }
    }
    
}
