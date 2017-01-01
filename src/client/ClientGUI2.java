/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import sun.awt.WindowClosingListener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

/**
 *
 * @author Adekunle
 */
public class ClientGUI2 extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JTextPane chatBox;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenuItem fileTransferMenu;
    private javax.swing.JMenuItem helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem logourMenu;
    private javax.swing.JButton sendmessageButton;
    private javax.swing.JTextField sendmessageTextfield;
    private javax.swing.JList<String> userList;
    // End of variables declaration

    //Communication Variables
    private Client client;

    /**
     * Creates new form NewJFrame
     */
    public ClientGUI2(Client client) {
        initComponents();
        this.client = client;
        chatBox.setEditable(false);
        chatBox.setEnabled(true);
    }

    public void updateChat() {
        new Thread(new ClientThread(client, userList, chatBox)).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        sendmessageButton = new javax.swing.JButton();
        sendmessageTextfield = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        fileTransferMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenuItem();
        logourMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        exitMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client GUI");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jScrollPane2.setViewportView(userList);

        sendmessageButton.setText(">");
        sendmessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendmessageButtonActionPerformed(evt);
            }
        });

        sendmessageTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendmessageTextfieldActionPerformed(evt);
            }
        });
        sendmessageTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sendmessageTextfieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sendmessageTextfieldKeyTyped(evt);
            }
        });

        jScrollPane3.setViewportView(chatBox);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3)
                                                .addGap(3, 3, 3)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(sendmessageTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(sendmessageButton)))
                                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane3)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sendmessageTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sendmessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
        );

        jMenu2.setText("Menu");

        fileTransferMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        fileTransferMenu.setText("File Transfer");
        fileTransferMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTransferMenuActionPerformed(evt);
            }
        });

        helpMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_HELP, 0));
        helpMenu.setText("Help");
        helpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuActionPerformed(evt);
            }
        });
        jMenu2.add(helpMenu);

        logourMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        logourMenu.setText("Log Out");
        logourMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logourMenuActionPerformed(evt);
            }
        });
        jMenu2.add(logourMenu);

        jMenuBar2.add(jMenu2);

        jMenu1.setText("Exit");

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>

    private void formWindowClosed(WindowEvent evt) {
        client.quitMessage();
        client.closeConnection();
    }

    private void helpMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void sendmessageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String message = sendmessageTextfield.getText();
        sendmessageTextfield.setText("");
        client.sendToChatBox(message); // Send message to the server.
        if (sendmessageTextfield.getText().length() == 0) {
            sendmessageButton.setEnabled(false);
        }else if (sendmessageTextfield.getText().length() >= 1) {
            sendmessageButton.setEnabled(true);
        }
    }

    private void sendmessageTextfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void sendmessageTextfieldKeyPressed(java.awt.event.KeyEvent evt) {
        if (sendmessageButton.isEnabled()){
            if ((evt.getKeyCode() == KeyEvent.VK_ENTER) && sendmessageTextfield.getText().length() >= 1) {
                String message = sendmessageTextfield.getText();
                sendmessageTextfield.setText("");
                client.sendToChatBox(message);
                sendmessageButton.setEnabled(false);
            }
        }else{
            sendmessageButton.setEnabled(false);
        }
    }

    private void sendmessageTextfieldKeyTyped(java.awt.event.KeyEvent evt) {
        sendmessageButton.setEnabled(true);
        if (sendmessageTextfield.getText().length() == 0) {
            sendmessageButton.setEnabled(false);
        }else if(checkChatLine(sendmessageTextfield.getText())){
            sendmessageButton.setEnabled(false);
        }
    }

    private boolean checkChatLine( String s ) {
        return s != null && s.matches("\\s+");
    }

    private void logourMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fileTransferMenuActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                reTryConnection();
            }
        });
    }

    private static void reTryConnection(){
        Client client = new Client();

        client.Connect();

        // Boot the GUI but don't show it unless user is logged in - Logic done in 'LoginGUI' class
        ClientGUI2 clientGUI = new ClientGUI2(client);
        clientGUI.setLocationRelativeTo(null);
        clientGUI.setResizable(false);


        // Set logintoAccount screen as the default.
        LoginGUI loginGUIDialog = new LoginGUI(clientGUI, true, client);
        loginGUIDialog.setLocationRelativeTo(null);
        loginGUIDialog.setVisible(true);

        if (client.getConnectionCount() == 3) {
            loginGUIDialog.loginButton.setEnabled(false);
            loginGUIDialog.registerButton.setEnabled(false);

            int userChoice = JOptionPane.showOptionDialog(null,
                    "Retry Connection to Server?",
                    "Retry?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, null, null);

            // interpret the user's choice
            if (userChoice == JOptionPane.YES_OPTION)
            {
                loginGUIDialog.dispose();
                reTryConnection();
            }else if (userChoice == JOptionPane.NO_OPTION){
                System.exit(0);
            }
        }
    }

}