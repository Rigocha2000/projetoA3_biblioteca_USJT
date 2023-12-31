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
        nomeTextField = new javax.swing.JTextField();
        sexoTextField = new javax.swing.JTextField();
        idadeTextField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        favComboBox1 = new javax.swing.JComboBox<>();
        favComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE USUARIO");

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

        sairButton.setText("VOLTAR");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        sexoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        idadeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));

        jTextField1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jTextField1.setText("Favoritos:");
        jTextField1.setBorder(null);

        favComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Tecnico", "Ficcao" }));
        favComboBox1.setBorder(null);
        favComboBox1.setOpaque(true);

        favComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Tecnico", "Ficcao" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(adminCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(senhaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(loginTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(favComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(favComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(favComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(cadastrarButton)
                .addGap(15, 15, 15)
                .addComponent(sairButton)
                .addGap(40, 40, 40))
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
        var nome = nomeTextField.getText();
        var idadeString = idadeTextField.getText();
        var sexo = sexoTextField.getText();
        var fav1 = (String)favComboBox1.getSelectedItem();
        var fav2 = (String)favComboBox2.getSelectedItem();

        if(login == null || login.length() == 0 || senha == null || senha.length() == 0 || email == null || email.length() == 0 || nome == null || nome.length() == 0 || idadeString == null || idadeString.length() == 0 || sexo == null || sexo.length() == 0 || fav1 == null || fav2 == null || fav1 == fav2) {
            JOptionPane.showMessageDialog(null, "Por favor insira as informações corretamente... preencha todos os campos!");
        }
        else {

            try {
                int idade = Integer.parseInt(idadeString);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor insira a idade corretamente... somente números inteiros!");
                idadeTextField.setText("");
                e.printStackTrace();
            }

            try {
                var user = new Usuario(login);
                var userDAO = new UsuarioDAO();

                int idade = Integer.parseInt(idadeString);
                

                if(userDAO.existeUsuario(user)){
                    JOptionPane.showMessageDialog(null, "Usuario já existente!");
                }
                else {

                    user.setLogin(login);
                    user.setSenha(senha);
                    user.setEmail(email);
                    user.setNome(nome);
                    user.setIdade(idade);
                    user.setSexo(sexo);
                    user.setFav1(fav1);
                    user.setFav2(fav2);
                    user.setAdmin(isAdmin);

                    try {
                        userDAO.cadastrar(user);
                        loginTextField.setText("");
                        senhaTextField.setText("");
                        emailTextField.setText("");
                        nomeTextField.setText("");
                        idadeTextField.setText("");
                        sexoTextField.setText("");
                        favComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ficcao", "Romance", "Tecnico" }));
                        favComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ficcao", "Romance", "Tecnico"  }));
                        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar o usuário...");
                e.printStackTrace();
            }

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
                if ("Flatlaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                else if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JComboBox<String> favComboBox1;
    private javax.swing.JComboBox<String> favComboBox2;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton sairButton;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JTextField sexoTextField;
    // End of variables declaration//GEN-END:variables
}
