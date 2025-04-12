package login;

import java.sql.SQLException;

public class Usuario {
    //Atributos privados das classes
    private String nome;
    private String usuario;
    private String senha;
    
    //atributo que armazenará o retorno do banco de dados
    private boolean resultUsuario;
    
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
            + " AND senha = md5('" + senha + "')");

        //Verificando se existe retorno de dados no banco
        if (banco.resultset.next()){
            //Caso tenha
            resultUsuario = true;
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
    
}
