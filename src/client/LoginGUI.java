package client;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.Frame;

/**
 * Created by Keno on 12/18/2016.
 */

class LoginGUI extends JFrame {

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameField;
    private String username;

    private Client client;
    private boolean loggedIn = false;
    private ClientGUI2 clientGUI;

    LoginGUI(Frame parent, boolean modal, Client client) {
        this.clientGUI = (ClientGUI2) parent;
        this.client = client;
        initComponents();
        username = usernameField.getText();
    }

    /**
     * This method checks the username and password field and sends them to the server.
     */
    private void attemptLogin() {
        if (usernameField.getText().equals("") || passwordField.getText().equals("")) {
            return;
        }
        if (client.logintoAccount(usernameField.getText(), passwordField.getText())) {
            this.setVisible(false);
            clientGUI.setVisible(true);
            loggedIn = true;
            clientGUI.updateChat();
        } else {
            JOptionPane.showMessageDialog(this, "Login details invalid",
                    "Wrong Credentials", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Auto generated by netBeans.
     */
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(passwordField)
                                                        .addComponent(usernameField))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerButton)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    // LoginGUI Button
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        attemptLogin();
    }


    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterGUI registerGUIDialog = new RegisterGUI(client);
        registerGUIDialog.setLocationRelativeTo(null);
        registerGUIDialog.setVisible(true);
    }

    String getUsername(){
        return username;
    }

    /**
     * When ENTER key is pressed then call the attempt logintoAccount method.
     */
    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            attemptLogin();
        }
    }

    // Window closing
    private void formWindowClosed(java.awt.event.WindowEvent evt) {
        client.quitMessage();
        client.closeConnection();
    }
}