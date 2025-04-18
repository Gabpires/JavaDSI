package login;

import java.sql.Connection; //Conexão com o banco de Dados
import java.sql.DriverManager; //Driver de conexão com banco de Dados sql
import java.sql.ResultSet; // Resultado das operações em banco de dados
import java.sql.SQLException; 
import java.sql.Statement; //Interpretação dos comandos SQL - CRUD

public class Conexao {
    // Atributos de conexão ligados as bibliotecas importadas
    public Connection con = null;
    public Statement stmt = null;
    public ResultSet resultset = null;
    
    // Atributos de conexão
    private final String servidor = "jdbc:mysql://127.0.0.1:3306/bd_login"; // servidor de banco de dados
    private final String usuario = "root"; // Usuário do banco de dados
    private final String senha = "Gab859632@"; // senha do banco de dados
    private final String driver = "com.mysql.cj.jdbc.Driver"; // Driver de conexão
    
    // Método de abertura da conexão com o banco de Dados
public Connection abrirConexao() {
 try {
    Class.forName(driver); // Driver de Utilização
    //atributos de conexão
    con = DriverManager.getConnection(servidor, usuario, senha);
    stmt = con.createStatement(); // Fazendo a conexão com banco de dados
    //Mensagem informando que a conexão foi feita com sucesso
    System.out.println("Conexão aberta com sucesso!");
  } catch (ClassNotFoundException | SQLException e) {
    // Mensagem de saída caso haja erro
    System.out.println("Erro ao acessar o banco de dados, verifique!" + e.getMessage());
}
   return con;
}

 // Método de fechamento da conexão com o banco de Dados
public void fecharConexao() {
   try {
   con.close(); //Fechamento da conexão com o banco de dados
   //mensagem que fechou a conexão
   System.out.println("conexão finalizada com sucesso");
} catch (SQLException e) {
  //Mensagem de erro ao fechar a conexão
  System.out.println("erro ao encerrar conexão" + e.getMessage());
}
}
}

