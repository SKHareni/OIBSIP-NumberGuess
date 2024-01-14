/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guess;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author skhar
 */
public class NumGamehome extends javax.swing.JFrame {
        
    
   
    /**
     * Creates new form Page
     */
    public NumGamehome() {
        initComponents();
        

        }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loading = new javax.swing.JLabel();
        loadvalue = new javax.swing.JLabel();
        pbar = new javax.swing.JProgressBar();
        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loading1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loading.setBackground(new java.awt.Color(255, 255, 255));
        loading.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading....");
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 388, 55));

        loadvalue.setBackground(new java.awt.Color(255, 255, 255));
        loadvalue.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        loadvalue.setForeground(new java.awt.Color(255, 255, 255));
        loadvalue.setText("0%");
        getContentPane().add(loadvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 740, 40, 55));

        pbar.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(pbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 1540, 30));

        heading.setBackground(new java.awt.Color(255, 255, 255));
        heading.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("NUMERIC GUESS");
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 640, 55));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\12333.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 520, 450));

        loading1.setBackground(new java.awt.Color(255, 255, 255));
        loading1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        loading1.setForeground(new java.awt.Color(0, 0, 0));
        loading1.setText("...___________________");
        getContentPane().add(loading1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 630, 55));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\1188874.jpg")); // NOI18N
        jLabel2.setText("click here to know!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 820));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** 
     * @param args the command line arguments
     */
 @SuppressWarnings("empty-statement")
    public static void main(String args[]) throws InstantiationException, UnsupportedLookAndFeelException {
        
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
              if("Nimbus".equals(info.getName()))
              {
                  try {
                      javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  } catch (IllegalAccessException ex) {
                      java.util.logging.Logger.getLogger(NumGamehome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  break;
              }
            }
        }
        catch (ClassNotFoundException ex)
        {
          java.util.logging.Logger.getLogger(NumGamehome.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        }
        NumGamehome ng=new NumGamehome();
        ng.setVisible(true);

try{
for(int i=0;i<=100;i++)
{
 Thread.sleep(50);
 ng.loadvalue.setText(i +"%");
if(i==10)
{ ng.loading.setText("Turning on Modules...");
}
if(i==30)
{ ng.loading.setText("Looading Modules...");
}
if(i==50)
{ ng.loading.setText("Connecting to database...");
}
if(i==80)
{ ng.loading.setText("Connection succ essful...");
}
if(i==90)
{ ng.loading.setText("Launching Application...");
}
ng.pbar.setValue(i);

}
NumGame ng1=new NumGame();
ng1.setVisible(true);
}
catch(Exception e)
{ JOptionPane.showMessageDialog(null,e);
}

     
  

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel loading1;
    private javax.swing.JLabel loadvalue;
    private javax.swing.JProgressBar pbar;
    // End of variables declaration//GEN-END:variables
}
