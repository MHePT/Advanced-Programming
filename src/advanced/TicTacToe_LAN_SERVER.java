package advanced;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TicTacToe_LAN_SERVER extends javax.swing.JFrame implements Runnable {

    String message;
    boolean your_turn = true;
    private ObjectInputStream input;
    private ObjectOutputStream output;

    public TicTacToe_LAN_SERVER() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jButton6.setText("6");
        jButton6.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton9.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton7.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton8.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(your_turn)
        try {
            output.writeObject("1");
            jButton1.setText("O");
            jButton1.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(your_turn)
        try {
            output.writeObject("2");
            jButton2.setText("O");
            jButton2.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(your_turn)
        try {
            output.writeObject("3");
            jButton3.setText("O");
            jButton3.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(your_turn)
        try {
            output.writeObject("4");
            jButton4.setText("O");
            jButton4.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(your_turn)
        try {
            output.writeObject("5");
            jButton5.setText("O");
            jButton5.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(your_turn)
        try {
            output.writeObject("6");
            jButton6.setText("O");
            jButton6.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(your_turn)
        try {
            output.writeObject("7");
            jButton7.setText("O");
            jButton7.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(your_turn)
        try {
            output.writeObject("8");
            jButton8.setText("O");
            jButton8.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(your_turn)
        try {
            output.writeObject("9");
            jButton9.setText("O");
            jButton9.setEnabled(false);
            your_turn = false;
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed


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
            java.util.logging.Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_LAN_SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_LAN_SERVER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        try {
            ServerSocket server = new ServerSocket(9000);
            TextArea.setText("Waiting for connection");
            Socket connection = server.accept(); //waits for client request to accept it ! , create socket to connect with the client
            output = new ObjectOutputStream(connection.getOutputStream());
            input = new ObjectInputStream(connection.getInputStream());

            output.writeObject("SERVER>>>>Connection successful");
            TextArea.setText("Connected");

            processClientMessages();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fatal Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void processClientMessages() {
        try {
            while (true) {
                message = (String) input.readObject();
                if (message.equals("TERMINATE")) {
                    output.writeObject("TERMINATE");
                    break;
                }
                Check(message,"X");
                if (checkWinner().equals("O")) {
                    TextArea.append("\nYou Win");
                    output.writeObject("TERMINATE");
                } else if (checkWinner().equals("X")) {
                    TextArea.append("\nYou Lose");
                    output.writeObject("\nYou Win");
                    output.writeObject("TERMINATE");
                }
                

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fatal Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Check(String message, String ch) {

        switch (message) {
            case "1":
                jButton1.setText(ch);
                jButton1.setEnabled(false);
                your_turn = true;
                break;
            case "2":
                jButton2.setText(ch);
                jButton2.setEnabled(false);
                your_turn = true;
                break;
            case "3":
                jButton3.setText(ch);
                jButton3.setEnabled(false);
                your_turn = true;
                break;
            case "4":
                jButton4.setText(ch);
                jButton4.setEnabled(false);
                your_turn = true;
                break;
            case "5":
                jButton5.setText(ch);
                jButton5.setEnabled(false);
                your_turn = true;
                break;
            case "6":
                jButton6.setText(ch);
                jButton6.setEnabled(false);
                your_turn = true;
                break;
            case "7":
                jButton7.setText(ch);
                jButton7.setEnabled(false);
                your_turn = true;
                break;
            case "8":
                jButton8.setText(ch);
                jButton8.setEnabled(false);
                your_turn = true;
                break;
            case "9":
                jButton9.setText(ch);
                jButton9.setEnabled(false);
                your_turn = true;
                break;
        }

    }
    
    String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = "";

            switch (a) {
                case 0:
                    line = jButton1.getText() + jButton2.getText() + jButton3.getText();
                    break;
                case 1:
                    line = jButton4.getText() + jButton5.getText() + jButton6.getText();
                    ;
                    break;
                case 2:
                    line = jButton7.getText() + jButton8.getText() + jButton9.getText();
                    ;
                    break;
                case 3:
                    line = jButton1.getText() + jButton4.getText() + jButton7.getText();
                    ;
                    break;
                case 4:
                    line = jButton2.getText() + jButton5.getText() + jButton8.getText();
                    ;
                    break;
                case 5:
                    line = jButton3.getText() + jButton6.getText() + jButton9.getText();
                    ;
                    break;
                case 6:
                    line = jButton1.getText() + jButton5.getText() + jButton9.getText();
                    ;
                    break;
                case 7:
                    line = jButton3.getText() + jButton5.getText() + jButton7.getText();
                    ;
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        return "";
    }
}
