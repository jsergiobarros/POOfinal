/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Henrique
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login2
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        antigo = new javax.swing.JCheckBox();
        novo = new javax.swing.JCheckBox();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        getContentPane().setLayout(null);

        jButtonEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(220, 250, 80, 20);

        jButtonSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(340, 250, 90, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Usuário");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 160, 60, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 200, 50, 20);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(270, 150, 130, 30);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(270, 200, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/pooo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 120, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 460);

        antigo.setSelected(true);
        antigo.setText("Login");
        antigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antigoActionPerformed(evt);
            }
        });
        getContentPane().add(antigo);
        antigo.setBounds(500, 103, 90, 30);

        novo.setText("Cadastrar");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        getContentPane().add(novo);
        novo.setBounds(500, 140, 90, 40);

        setSize(new java.awt.Dimension(615, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        //botão sair da tela de login
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    public class user{
        String user,senha;
        public user(String user,String senha){
            this.user=user;
            this.senha=senha;
        }
                
       
    }
    ArrayList usuarios=new ArrayList();
    static int cont=0;
    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
    //botão acessar da tela de login
    String usaux=jTextFieldUsuario.getText(),seaux=jPasswordFieldSenha.getText();
    System.out.println(usaux+"  "+seaux);
    if (alterna==true){
        for(int i=0;i<usuarios.size();i++){
            user u = (user) usuarios.get(i);
            if(u.user==usaux){
                if(u.senha==seaux){
                    AreaDeUsuario principal = new AreaDeUsuario();
                    principal.setVisible(true);
                    dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "Senha inválida!");
            }
            else
                JOptionPane.showMessageDialog(null, "Usuário inválido!");      
        }
        boolean vazio=false;
        if (alterna==false){
            for(int i=0;i<usuarios.size();i++){
                user u = (user) usuarios.get(i);
                if(u.user==usaux){
                    JOptionPane.showMessageDialog(null, "Usuário já existente");
                    vazio=true;
                    break;
                }
            }
            if (vazio==true)
                usuarios.add(new user(usaux,seaux));
            System.out.println(usuarios.size());
        }

        
        }    
    }//GEN-LAST:event_jButtonEntrarActionPerformed
    boolean alterna=true;
    private void antigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antigoActionPerformed
        antigo.setSelected(true);
        novo.setSelected(false);
        alterna=true;
                System.out.println(alterna);
        // TODO add your handling code here:
    }//GEN-LAST:event_antigoActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        novo.setSelected(true);
        antigo.setSelected(false);
        alterna=false;
        System.out.println(alterna);
        // TODO add your handling code here:
    }//GEN-LAST:event_novoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox antigo;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JCheckBox novo;
    // End of variables declaration//GEN-END:variables
}
