package login;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static login.Usuario.usuarioSistema;
import java.awt.HeadlessException;


public class TelaAlteracao extends JFrame {
    //Criando atributos globais 
    private final JPanel tela;
    private final JTextField txtNome;
    private final JPasswordField passAtual;
    private final JPasswordField passSenha;
    private final JPasswordField confPassSenha;
    private boolean atualizacaoValida;
    
    public TelaAlteracao() {
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Senha - Alteração");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 426, 212);

        tela = new JPanel();
        tela.setBackground(SystemColor.gray);
        setContentPane(tela);
        tela.setLayout(null);

        //adicionando elementos na tela:
        JLabel lblIdentificacao = new JLabel("Informar campos para alteração");
        lblIdentificacao.setBounds(60, 0, 500, 39);
        lblIdentificacao.setFont(new Font("Arial", 3, 19));
        tela.add(lblIdentificacao);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(24, 35, 100, 15);
        tela.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120, 35, 218, 20);
        tela.add(txtNome);
        txtNome.setColumns(10);

        JLabel lblSenhaAtual = new JLabel("Senha Atual");
        lblSenhaAtual.setBounds(24, 60, 70, 15);
        tela.add(lblSenhaAtual);

        passAtual = new JPasswordField();
        passAtual.setBounds(120, 60, 219, 19);
        tela.add(passAtual);

        JLabel lblnovasenha = new JLabel("Nova Senha");
        lblnovasenha.setBounds(24, 85, 70, 15);
        tela.add(lblnovasenha);

        passSenha = new JPasswordField();
        passSenha.setBounds(120, 85, 219, 19);
        tela.add(passSenha);

        JLabel lblConfSenha = new JLabel("Confirmar Senha");
        lblConfSenha.setBounds(24, 110, 100, 15);
        tela.add(lblConfSenha);

        confPassSenha = new JPasswordField();
        confPassSenha.setBounds(120, 110, 219, 19);
        tela.add(confPassSenha);

        JButton btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(200, 136, 117, 25);
        tela.add(btnAlterar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(50, 136, 117, 25);
        tela.add(btnCancelar);

       btnCancelar.addActionListener((ActionEvent e) -> {
        TelaInicio telaIni = new TelaInicio();
        telaIni.setVisible(true);
        dispose();
});
       
       //Botão de Alteração
       btnAlterar.addActionListener((ActionEvent e) -> {
           try {
               //Classe usuario
               Usuario usu = new Usuario();
               
               //Validações antes da alteração
               usu.setSenha(confPassSenha.getText());
               usu.setUsuario(usuarioSistema);
               
               //nome vazio
               if ("".equals(usu.getNome())) {
                   //Mensagem na tela
                   JOptionPane.showMessageDialog(null,
                           "Campo nome precisa ser informado!",
                           "Atenção",
                           JOptionPane.ERROR_MESSAGE);
                   //voltar curso para o campo txtNome
                   txtNome.grabFocus();
                //Senha Vazia 
               } else if("".equals(usu.getSenha())) {
                   //Mensagem na tela 
                   JOptionPane.showMessageDialog(null,
                           "Campo Senha precisa ser informado!",
                           "Atenção",
                           JOptionPane.ERROR_MESSAGE);  
                   //Voltar cursor para campo senha
                   passSenha.grabFocus();
               } else if(usu.verificaUsuario(usu.getUsuario(),
                         passAtual.getText()) == false) {
                   //Mensgaem na tela
                   JOptionPane.showMessageDialog(null,
                           "Senha Invalida, verifique!",
                           "Atenção",
                           JOptionPane.ERROR_MESSAGE);
                   //voltar cursor para o campo senha
                   passSenha.grabFocus();
               } else if (!passSenha.getText().equals(confPassSenha.getText())) {
                   // mensagem na tela
                   JOptionPane.showMessageDialog(null,
                          "Campos de Senha e Confirmação não são iguais!",
                          "Atenção",
                          JOptionPane.ERROR_MESSAGE);
                   //voltar cursor para o campo senha
                   passSenha.grabFocus();
               } else {
                   //Alteração de usuário
                   atualizacaoValida = usu.alteraUsuario(usu.getUsuario(),
                           txtNome.getText(),
                           usu.getSenha());
                   
                   if (atualizacaoValida == true ) {
                       //Usuario na base de dados
                       JOptionPane.showMessageDialog(null,
                               "Dado(s) do usuario alterado(s) retornaremos" 
                       + "a tela login.", 
                               "Atenção",
                               JOptionPane.INFORMATION_MESSAGE);
                   
                               // Abrimos a tela de login novamente
            TelaLogin tLogin = new TelaLogin();
            tLogin.abreTela();

            // Fecho a tela de cadastro
            dispose();
        } else {
            // Usuario cadastrado na base de dados
            JOptionPane.showMessageDialog(null,
                "Problemas ao atualizar o usuário",
                "Atenção",
                JOptionPane.ERROR_MESSAGE);
        }
    } 
 } catch (HeadlessException ec) {
        System.out.println("Erro ao alterar usuário " 
            + ec.getMessage());
    }
       });

// Atribuir o atributo global ao objeto
txtNome.setText(Usuario.nomeUsuario);

               }
    public void abreTela() {
    TelaAlteracao telaAlteracao = new TelaAlteracao();
    telaAlteracao.setVisible(true);
}
       }


