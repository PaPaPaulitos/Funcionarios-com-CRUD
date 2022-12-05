/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.uva.sga.visao;

import javax.swing.*;

import br.uva.sga.modelo.Pessoa;
import br.uva.sga.controle.dao.PessoaDAO;

/**
 *
 * @author 20212101161
 */
public class LoginFiscal extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginFiscal() {
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

        label_loginfiscal = new javax.swing.JLabel();
        jtextfield_digitelogin = new javax.swing.JTextField();
        label_digitelogin = new javax.swing.JLabel();
        label_digitesenha = new javax.swing.JLabel();
        jtextfield_digitesenha = new javax.swing.JPasswordField();
        jbutton_logar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        label_loginfiscal.setBackground(new java.awt.Color(255, 255, 255));
        label_loginfiscal.setText("Login Fiscal");
        label_loginfiscal.setName("label_loginfiscal"); // NOI18N

        jtextfield_digitelogin.setName("jtextfield_digitelogin"); // NOI18N
        jtextfield_digitelogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfield_digiteloginActionPerformed(evt);
            }
        });

        label_digitelogin.setBackground(new java.awt.Color(255, 255, 255));
        label_digitelogin.setText("Digite o login:");
        label_digitelogin.setName("label_digitelogin"); // NOI18N

        label_digitesenha.setBackground(new java.awt.Color(255, 255, 255));
        label_digitesenha.setText("Digite a senha:");
        label_digitesenha.setName("label_digitesenha"); // NOI18N

        jtextfield_digitesenha.setName("jtextfield_digitesenha"); // NOI18N

        jbutton_logar.setLabel("Logar");
        jbutton_logar.setName("jbutton_logar"); // NOI18N
        jbutton_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_logarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/paulitos/Documents/Cursos/Cursos_Backup_30-04-22/Faculdade/3º periodo/POO/A4_POO/Trabalho_POO_Versão_Final/mavenproject1/Funcionarios-main/src/main/java/br/uva/sga/visao/Icones/PaulitosBUS_semFundo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_digitelogin)
                    .addComponent(label_loginfiscal))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtextfield_digitelogin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextfield_digitesenha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(label_digitesenha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jbutton_logar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(label_loginfiscal)
                        .addGap(42, 42, 42)
                        .addComponent(label_digitelogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)))
                .addComponent(jtextfield_digitelogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(label_digitesenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtextfield_digitesenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jbutton_logar)
                .addGap(25, 25, 25))
        );

        label_digitelogin.getAccessibleContext().setAccessibleName("labelLogin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextfield_digiteloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfield_digiteloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfield_digiteloginActionPerformed

    private void jbutton_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_logarActionPerformed
        // TODO add your handling code here:
        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.consult(getJtextfield_digitelogin().getText());
        String senhaRetornada = "";
        for (int i =0;i<getJtextfield_digitesenha().getPassword().length;i++){
            senhaRetornada += getJtextfield_digitesenha().getPassword()[i];
        }


        if(pessoa.getSenha().equals(senhaRetornada)){
            Configuracoes menu = new Configuracoes();
            menu.menu(pessoa);
            getLabel_loginfiscal().setText("Logado como " + pessoa.getNome());
            this.dispose();

        }else{
            getLabel_loginfiscal().setText("Login incorreto");
        }
    }//GEN-LAST:event_jbutton_logarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFiscal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbutton_logar;
    private javax.swing.JTextField jtextfield_digitelogin;
    private javax.swing.JPasswordField jtextfield_digitesenha;
    private javax.swing.JLabel label_digitelogin;
    private javax.swing.JLabel label_digitesenha;
    private javax.swing.JLabel label_loginfiscal;
    // End of variables declaration//GEN-END:variables


    public JButton getJbutton_logar() {
        return jbutton_logar;
    }

    public void setJbutton_logar(JButton jbutton_logar) {
        this.jbutton_logar = jbutton_logar;
    }

    public JTextField getJtextfield_digitelogin() {
        return jtextfield_digitelogin;
    }

    public void setJtextfield_digitelogin(JTextField jtextfield_digitelogin) {
        this.jtextfield_digitelogin = jtextfield_digitelogin;
    }

    public JPasswordField getJtextfield_digitesenha() {
        return jtextfield_digitesenha;
    }

    public void setJtextfield_digitesenha(JPasswordField jtextfield_digitesenha) {
        this.jtextfield_digitesenha = jtextfield_digitesenha;
    }

    public JLabel getLabel_digitelogin() {
        return label_digitelogin;
    }

    public void setLabel_digitelogin(JLabel label_digitelogin) {
        this.label_digitelogin = label_digitelogin;
    }

    public JLabel getLabel_digitesenha() {
        return label_digitesenha;
    }

    public void setLabel_digitesenha(JLabel label_digitesenha) {
        this.label_digitesenha = label_digitesenha;
    }

    public JLabel getLabel_loginfiscal() {
        return label_loginfiscal;
    }

    public void setLabel_loginfiscal(JLabel label_loginfiscal) {
        this.label_loginfiscal = label_loginfiscal;
    }
}
