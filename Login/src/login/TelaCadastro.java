package login;

/*
Importações de todas as bibliotecas que serão utilizadas na classe
*/
import java.awt.Font; //Trabalhar com fontes
import java.awt.HeadlessException; // 
import java.awt.SystemColor; //Trabalhar com cores
import java.awt.event.ActionEvent; //Trabalhar com eventos
import javax.swing.JButton; //Trabalhar com botões
import javax.swing.JFrame; //Trabalhar com frames
import javax.swing.JLabel; //Trabalhar com labels
import javax.swing.JPanel; //Trabalhar com painéis
import javax.swing.JOptionPane; //Trabalahr com mensagens
import javax.swing.JPasswordField; //Trabalhar com campos de senha
import javax.swing.JTextField; //Trabalhar com campos de texto

public class TelaCadastro extends JFrame{
    private final JPanel tela;
    private final JTextField txtNome;
    private final JTextField txtUsuario;
    private final JPasswordField passSenha;
    private final JPasswordField passConfSenha;
    
    // validações de usuario e cadastro corretos
    private boolean usuarioValido;
    private boolean cadastroValido;
    
    //String de mensagem
    private String mensagemJOption;
    private int mensagemTipo = 0;
    
    //Método construtor de classe 
    public TelaCadastro() {
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Cadastro");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setBounds (500, 200, 426, 230);
        
        tela = new JPanel();
        tela.setBackground(SystemColor.gray);
        setContentPane(tela);
        tela.setLayout(null);
        
        //Adicionando elementos na tela
        JLabel lblIdentificacao = new JLabel("Informar campos para cadastro");
        lblIdentificacao.setBounds(60, 0, 500, 39);
        lblIdentificacao.setFont(new Font("Arial", 3, 19));
        tela.add(lblIdentificacao);
        
        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(24, 50, 70, 15);
        tela.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120, 50, 219, 19);
        tela.add(txtNome);
        txtNome.setColumns(10);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(24, 75, 70, 15);
        tela.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 75, 219, 19);
        tela.add(txtUsuario);
        txtUsuario.setColumns(10);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(24, 100, 70, 15);
        tela.add(lblSenha);

        passSenha = new JPasswordField();
        passSenha.setBounds(120, 100, 219, 19);
        tela.add(passSenha);

        JLabel lblConfSenha = new JLabel("Confirmar Senha");
        lblConfSenha.setBounds(24, 125, 100, 15);
        tela.add(lblConfSenha);

        passConfSenha = new JPasswordField();
        passConfSenha.setBounds(120, 125, 219, 19);
        tela.add(passConfSenha);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(200, 156, 117, 25);
        tela.add(btnCadastrar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(50, 156, 117, 25);
        tela.add(btnCancelar);     
        
        // botão cancelar
        btnCancelar.addActionListener((ActionEvent e) -> {
            TelaLogin tLogin = new TelaLogin();
            tLogin.abreTela();
            dispose();
        });
        
        // Ação de cadastrar usuario na base de dados
        btnCadastrar.addActionListener((ActionEvent e) -> {
            try{
                //Instacia o usuario
                Usuario usu = new Usuario();
                
                //Realizando os setters dos dados da tela
                usu.setNome(txtNome.getText());
                usu.setUsuario(txtUsuario.getText());
                usu.setSenha(passSenha.getText());
                
                //Validação do preenchimento de dados
                if("".equals(usu.getNome())) {
                    mensagemJOption = "campo nome precisa ser preenchido!";
                    mensagemTipo = 0;
                } else if("".equals(usu.getUsuario())) {
                    mensagemJOption = "campo usuario precisa ser preenchido!";
                } else if("".equals(usu.getSenha())) {
                    mensagemJOption = "campo senha precisa ser preenchido";
                    mensagemTipo = 0;
                } else if (!usu.getSenha().equals(passConfSenha.getText())) {
                    mensagemJOption = "Campos senha e confirmação de senha não coincidem!";
                    mensagemTipo = 0;
                } else {
                    // Verifica se usuario consta no banco
                    // neste caso, fará uma sobrecarga de método    
                    usuarioValido = usu.verificaUsuario(usu.getUsuario());
                    
                    if (usuarioValido == true) {
                        //Caso exista, não pode ser colocado na base 
                        mensagemJOption = "Usuário já consta na base de dados!";
                        mensagemTipo = 0;
                    } else {
                        cadastroValido = usu.cadastraUsuario(usu.getNome(),
                                usu.getUsuario(),
                                usu.getSenha());
                        
                        if (cadastroValido == true) {
                            // Mensagem de usuario cadastrado
                            mensagemJOption = "Usuário cadastrado corretamente";
                            mensagemTipo = 1;
                        } else {
                            //Erro
                            mensagemJOption = "Problemas ao cadastrar usuario";
                            mensagemTipo = 0;
                        }
                    }
                }
                
                //Mostrar a mensagem referida
                JOptionPane.showMessageDialog(null,
                        mensagemJOption, "Atenção", mensagemTipo);
                if (mensagemTipo == 1) {
                    //Volta para tela Login
                    TelaLogin tLogin = new TelaLogin();
                    tLogin.abreTela();
                    
                    //Fecha a tela de cadastro
                    dispose();
                }
            } catch (HeadlessException ec) {
                System.out.println("Erro no cadastro do usuario" + ec.getMessage());
            }
        });
    }
    public void abreTela() {
        TelaCadastro panelCadastro = new TelaCadastro();
        panelCadastro.setVisible(true);
    }
}
