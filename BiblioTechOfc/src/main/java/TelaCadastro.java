/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Ramos
 */
public class TelaCadastro extends javax.swing.JFrame {

    private boolean isAdmin = false;

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JTextField();
        adminCheckBox = new javax.swing.JCheckBox();
        cadastrarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        senhaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        adminCheckBox.setText("Administrador");
        adminCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCheckBoxActionPerformed(evt);
            }
        });

        cadastrarButton.setText("CADASTRAR");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        sairButton.setText("SAIR");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(adminCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(senhaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(loginTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(cadastrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cadastrarButton)
                .addGap(18, 18, 18)
                .addComponent(sairButton)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCheckBoxActionPerformed
        isAdmin  = !isAdmin;
    }//GEN-LAST:event_adminCheckBoxActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
        new TelaAdmin().setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        
        var login = loginTextField.getText();
        var senha = senhaTextField.getText();
        var email = emailTextField.getText();
        
        //definir comando SQL
        String sql = "INSERT INTO tb_login (login, senha, email, isAdmin) VALUES (?, ?, ?, ?)";
        
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setString(1, login);
            ps.setString(2, senha);
            ps.setString(3, email);
            ps.setBoolean(4, isAdmin);
            //executa o comando
            ps.execute();
            this.dispose();
            JOptionPane.showMessageDialog(this, "Usuario criado com sucesso!");
            new TelaAdmin().setVisible(true);

        }
        catch (Exception e){
            e.printStackTrace();
           
        }


    }//GEN-LAST:event_cadastrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adminCheckBox;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JButton sairButton;
    private javax.swing.JTextField senhaTextField;
    // End of variables declaration//GEN-END:variables
}