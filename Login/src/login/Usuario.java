package login;

import java.sql.SQLException;

public class Usuario {
    //Atributos privados das classes
    private String nome;
    private String usuario;
    private String senha;
    
    //atributo que armazenará o retorno do banco de dados
    private boolean resultUsuario;
    private boolean resultCadastro;
     
    public static String nomeUsuario;
    public static String usuarioSistema;
    
    
    
    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Método de verificação da autenticidade do usuario
public boolean verificaUsuario(String usuario, String senha){
    //Fazer a instância da conexão com o banco de dados
    Conexao banco = new Conexao();

    try{
        //Abro a conexão com o banco de dados
        banco.abrirConexao();

        //Criando parâmetro de retorno
        banco.stmt= banco.con.createStatement();

        //Executando a consulta no banco de dados
        banco.resultset = 
            banco.stmt.executeQuery("SELECT * FROM usuario "
            + " WHERE usuario = '" + usuario + "'"
            + " AND senha = '" + senha + "'");

        //Verificando se existe retorno de dados no banco
        if (banco.resultset.next()){
            //Caso tenha
            resultUsuario = true;
            
            //setters em nome e usuario
            setNome(banco.resultset.getString(1));
            setUsuario(banco.resultset.getString(2));
            
            //Realizando atribuições nos atríbutos estáticos
            nomeUsuario = this.getNome();
            usuarioSistema = this.getUsuario();
        }else{
            //Caso não tenha
            resultUsuario = false;
        }

        banco.fecharConexao(); // fecha nossa conexão com o banco de dados

    }catch (SQLException ec) {
        System.out.println("Erro ao consultar usuário " + ec.getMessage());
    }

    return resultUsuario;
}

   //Método de verificação de usuario, com sobrecarga de método
   public boolean verificaUsuario(String usuario) {
       //Conexão com o banco 
       Conexao banco = new Conexao();
       
       try {
           //Abre conexão
           banco.abrirConexao();
           
           //Retorno
           banco.stmt = banco.con.createStatement();
           
           //Consulta
           banco.resultset = banco.stmt.executeQuery("SELECT * FROM usuario" + " WHERE USUARIO = '" + usuario + "'");
           
           //verifica retorno no banco de dados
           if (banco.resultset.next()) {
               //caso tenha
               resultUsuario = true;
           } else {
               //caso não tenha 
               resultUsuario = false;
           }
           banco.fecharConexao();
       } catch (SQLException ec) {
           System.out.println("Erro ao consultar usuário " + ec.getMessage());
       }
       return resultUsuario;
   }
   
   //Cadastro de usuario
   public boolean cadastraUsuario (String nome, String usuario, String senha) {
       //Conexao
       Conexao banco = new Conexao();
       
       try {
           //abertura de conexao
           banco.abrirConexao();
           
           //retorno
           banco.stmt = banco.con.createStatement();
           
           //Inserção de dados
           banco.stmt.execute("INSERT INTO usuario (nome, usuario, senha)" + "VALUES('" + nome + "', '" + usuario + "', md5('" + senha + "'))");
           
           resultCadastro = true;
       } catch(SQLException ec) {
           System.out.println("Erro ao inserir o usuario " + ec.getMessage());
           resultCadastro = false;
       }
       
       return resultCadastro;
   }
    
}
