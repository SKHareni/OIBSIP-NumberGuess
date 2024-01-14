/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guess;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author skhar
 */
public class NumGame extends javax.swing.JFrame {
        
    String str2="";
    private int compno=0;
  
    public NumGame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        yourchoice = new javax.swing.JTextField();
        randnumdisp = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        playerf = new javax.swing.JTextField();
        scorebox = new javax.swing.JLabel();
        finish = new javax.swing.JButton();
        winlose = new javax.swing.JLabel();
        replay = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        GU = new javax.swing.JLabel();
        attemptsleft = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUMBER GUESSING GAME......!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 650, 60));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guess/flag.png"))); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 700, 130, 50));

        result.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setText("       Status");
        result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
        });
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 190, 50));

        yourchoice.setBackground(new java.awt.Color(255, 255, 255));
        yourchoice.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        yourchoice.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(yourchoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 190, 40));

        randnumdisp.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        randnumdisp.setForeground(new java.awt.Color(255, 255, 255));
        randnumdisp.setText("   Rand num");
        randnumdisp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        randnumdisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randnumdispMouseClicked(evt);
            }
        });
        getContentPane().add(randnumdisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 190, 50));

        player.setBackground(new java.awt.Color(255, 255, 255));
        player.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        player.setForeground(new java.awt.Color(255, 255, 255));
        player.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\logo ga.png")); // NOI18N
        getContentPane().add(player, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, 130));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GUESS STATUS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 388, 70));

        score.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        score.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guess/reward.png"))); // NOI18N
        score.setText("SCORE");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 260, 150, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RANDOM GENERATED NUMBER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 388, 55));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("YOUR CHOICE OF NUMBER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 388, 55));

        playerf.setBackground(new java.awt.Color(255, 255, 255));
        playerf.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        playerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerfActionPerformed(evt);
            }
        });
        getContentPane().add(playerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, 40));

        scorebox.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        scorebox.setForeground(new java.awt.Color(255, 255, 255));
        scorebox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        scorebox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreboxMouseClicked(evt);
            }
        });
        getContentPane().add(scorebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 260, 120, 60));

        finish.setBackground(new java.awt.Color(255, 0, 153));
        finish.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        finish.setForeground(new java.awt.Color(0, 0, 0));
        finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guess/logout.png"))); // NOI18N
        finish.setText("CLOSE");
        finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishMouseClicked(evt);
            }
        });
        getContentPane().add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 700, 130, 50));

        winlose.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        winlose.setForeground(new java.awt.Color(255, 255, 255));
        winlose.setIcon(new javax.swing.ImageIcon("C:\\Users\\skhar\\Downloads\\trophy.png")); // NOI18N
        winlose.setText(" WIN OR LOSE");
        winlose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        winlose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                winloseMouseClicked(evt);
            }
        });
        getContentPane().add(winlose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 450, 260, 70));

        replay.setBackground(new java.awt.Color(255, 204, 255));
        replay.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        replay.setForeground(new java.awt.Color(0, 0, 0));
        replay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guess/replay.png"))); // NOI18N
        replay.setText("REPLAY");
        replay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                replayMouseClicked(evt);
            }
        });
        getContentPane().add(replay, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 700, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\GAMEDEF.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 450, 390));

        GU.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        GU.setForeground(new java.awt.Color(255, 255, 255));
        GU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guess/heart.png"))); // NOI18N
        GU.setText("ATTEMPTS");
        getContentPane().add(GU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 170, -1, -1));

        attemptsleft.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        attemptsleft.setForeground(new java.awt.Color(255, 255, 255));
        attemptsleft.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        attemptsleft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attemptsleftMouseClicked(evt);
            }
        });
        getContentPane().add(attemptsleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 160, 120, 60));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PLAYER NAME");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 388, 55));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\1188874.jpg")); // NOI18N
        jLabel2.setText("click here to know!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1700, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        if(playerf.getText().isEmpty() )
    {
       JOptionPane.showMessageDialog(null,"ENTER PLAYER NAME TO CONTINUE");
        
     }
    else{
    {
    for(int i=3;i>=1;i--){
        
         String a=JOptionPane.showInputDialog(this,"Enter number between 1-100");
         int guess =(i-1);
         GU.setText("LEFT OUT TRAILS ->");
         attemptsleft.setText(Integer.toString(guess));
         yourchoice.setText(a);
       
         //to generate random number
         compno = (int)( Math.random()*10+1);
         str2 = Integer.toString(compno);
         randnumdisp.setText(str2);  
           
        String user =yourchoice.getText();
        int un=Integer.parseInt(user);

        if(un <=0 || un> 10)
        {
        result.setText("INVALID!");
        JOptionPane.showMessageDialog(null," INVALID GUESS");
   
        }
        else if (un==compno)
        {   
            result.setText("VALID!");
            if(guess==2)
            {
                
                 scorebox.setText("100");
                 JOptionPane.showMessageDialog(null," VALID GUESS !!     GUESSED AT 1st  ATTEMPT ");
                 
            }
            else if(guess==1)
            {
                  JOptionPane.showMessageDialog(null," VALID GUESS !!     GUESSED AT 2nd  ATTEMPT");
                  scorebox.setText("75");
            }
            else if (guess==0)
            {
                  JOptionPane.showMessageDialog(null," VALID GUESS !!     GUESSED AT 3rd  ATTEMPT");
                 scorebox.setText("50");
            }
        winlose.setText("WON :) ");
        JOptionPane.showMessageDialog(null," YOU WON !");
        break;
 
  
        }
        else if  (un>compno)
        {
         result.setText(" HIGH!");
         JOptionPane.showMessageDialog(null," HIGH GUESS");
        }
        else if (un<compno)
        { 
             result.setText("LOW!");
          JOptionPane.showMessageDialog(null," LOW GUESS");
        }
       if(guess ==0 )
   {
    scorebox.setText("00");
    winlose.setText("LOST :(");}
     
    }}}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
   
    }//GEN-LAST:event_resultMouseClicked

    private void randnumdispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randnumdispMouseClicked
    
    }//GEN-LAST:event_randnumdispMouseClicked

    private void playerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerfActionPerformed

    private void finishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishMouseClicked

        String url = "jdbc:mysql://localhost:3306/guess";
        String username = "root";
        String password = "";
        String playname = playerf.getText();
        String win_lose = winlose.getText();
       
        // SQL query for insertion
        String insertQuery = "INSERT INTO player (playname, win_lose) VALUES (?, ?)";

        // Establish a database connection
        try (Connection connection = DriverManager.getConnection(url, username, password);
             java.sql.PreparedStatement preparedStatement = connection.prepareStatement(insertQuery))
        {

            // Set parameters for the prepared statement
            preparedStatement.setString(1, playname);
            preparedStatement.setString(2, win_lose);

            // Execute the insertion
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) 
            {
                System.out.println("Data inserted successfully!");
            }
            
            else 
            {
                System.out.println("Failed to insert data.");
            }

        } 
        catch (SQLException e) {
            System.err.println("Error connecting/inserting data: " + e.getMessage());
            e.printStackTrace();
        }
        
        exit(0);
          
    }//GEN-LAST:event_finishMouseClicked

    private void scoreboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreboxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreboxMouseClicked

    private void winloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_winloseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_winloseMouseClicked

    private void replayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_replayMouseClicked
     // playerf.setText("");
      yourchoice.setText("");
      result.setText("");
      winlose.setText("");
      randnumdisp.setText("");
      attemptsleft.setText("3");
      GU.setText("ATTEMPTS");
      scorebox.setText("");

    }//GEN-LAST:event_replayMouseClicked

    private void attemptsleftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attemptsleftMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attemptsleftMouseClicked

    /** 
     * @param args the command line arguments
     */
 @SuppressWarnings("empty-statement")
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
            java.util.logging.Logger.getLogger(NumGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GU;
    private javax.swing.JLabel attemptsleft;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton finish;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel player;
    private javax.swing.JTextField playerf;
    private javax.swing.JLabel randnumdisp;
    private javax.swing.JButton replay;
    private javax.swing.JLabel result;
    private javax.swing.JLabel score;
    private javax.swing.JLabel scorebox;
    private javax.swing.JLabel winlose;
    private javax.swing.JTextField yourchoice;
    // End of variables declaration//GEN-END:variables

    static class load {

        public load() {
        }
    }
}
