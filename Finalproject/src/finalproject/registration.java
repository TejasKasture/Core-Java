package finalproject;

import finalproject.registration2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.beans.ConstructorProperties;
import java.io.File;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class registration extends javax.swing.JFrame
{

    private static JFrame reg; 
    
    private static JFrame refReg2;
    public registration()
    {
        initComponents();
        reg=this;
        refReg2=null;
    
     BufferedImage img1,img2,img3;
       
         
        try
        {
            img1=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\rightarrow_png.png"));
            
            Image dimg1;
             dimg1=img1.getScaledInstance(lblnext.getWidth(),lblnext.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon1=new ImageIcon(dimg1);
             lblnext.setIcon(imageicon1);
             
             //
             img2=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\man.png"));
            
             Image dimg2;
             dimg2=img2.getScaledInstance(lblman.getWidth(),lblman.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon2=new ImageIcon(dimg2);
             lblman.setIcon(imageicon2);
              
             
             img3=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\closebtn.png"));
        
             Image dimg3;
             dimg3=img3.getScaledInstance(lblclose.getWidth(),lblclose.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon3=new ImageIcon(dimg3);
             lblclose.setIcon(imageicon3);
             
        }
        catch(Exception e)
        {
            
            System.out.println("caught = "+e);
        }
        
        setVisible(true);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        gendergrp = new javax.swing.ButtonGroup();
        pnlmain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblnext = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbtnmale = new javax.swing.JRadioButton();
        rbtnfemale = new javax.swing.JRadioButton();
        lblman = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlmain.setBackground(new java.awt.Color(49, 71, 94));
        pnlmain.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setBackground(new java.awt.Color(196, 166, 123));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setOpaque(true);

        txtmname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtmname.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtmnameKeyTyped(evt);
            }
        });

        txtlname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtlname.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtlnameKeyTyped(evt);
            }
        });

        txtfname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtfname.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtfnameKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(196, 166, 123));
        jLabel2.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(196, 166, 123));
        jLabel4.setText("Middle Name");

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(196, 166, 123));
        jLabel5.setText("Email");

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtemailKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Create An Account");

        lblnext.setBackground(new java.awt.Color(49, 71, 94));
        lblnext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblnext.setForeground(new java.awt.Color(255, 255, 255));
        lblnext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnext.setText("Next");
        lblnext.setOpaque(true);
        lblnext.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblnextMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(196, 166, 123));
        jLabel7.setText("Last Name");

        jLabel8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(196, 166, 123));
        jLabel8.setText("Gender");

        gendergrp.add(rbtnmale);
        rbtnmale.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        rbtnmale.setForeground(new java.awt.Color(196, 166, 123));
        rbtnmale.setText("Male");

        gendergrp.add(rbtnfemale);
        rbtnfemale.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        rbtnfemale.setForeground(new java.awt.Color(196, 166, 123));
        rbtnfemale.setText("Female");
        rbtnfemale.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbtnfemaleActionPerformed(evt);
            }
        });

        lblman.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblman.setForeground(new java.awt.Color(255, 255, 255));
        lblman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblman.setText("MAN");

        lblclose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblclose.setForeground(new java.awt.Color(255, 255, 255));
        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("close");
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlmainLayout = new javax.swing.GroupLayout(pnlmain);
        pnlmain.setLayout(pnlmainLayout);
        pnlmainLayout.setHorizontalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblman, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlmainLayout.createSequentialGroup()
                        .addComponent(lblnext, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlmainLayout.createSequentialGroup()
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlmainLayout.createSequentialGroup()
                                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmname, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(pnlmainLayout.createSequentialGroup()
                        .addComponent(rbtnmale)
                        .addGap(31, 31, 31)
                        .addComponent(rbtnfemale)
                        .addContainerGap())))
        );
        pnlmainLayout.setVerticalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlmainLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlmainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmainLayout.createSequentialGroup()
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnmale)
                            .addComponent(rbtnfemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(lblnext, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlmainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblman, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnfemaleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbtnfemaleActionPerformed
    {//GEN-HEADEREND:event_rbtnfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnfemaleActionPerformed

    
    private boolean isValidEmail(String email) 
    {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher=pattern.matcher(email);
        
        if (email == null) {
            return false;
        }
        
        if(matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //INSERTING DATE into databae
    public  static void addDataOfReg1(registration ref)
    {
           try {
          java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");      
          String query = "INSERT INTO studentinfo(fname,mname,lname,email,gender) VALUES (?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            
            pstmt.setString(1,ref.txtfname.getText());
            pstmt.setString(2, ref.txtmname.getText());
            pstmt.setString(3, ref.txtlname.getText());
            pstmt.setString(4, ref.txtemail.getText());
            if(ref.rbtnmale.isSelected())
            {
                pstmt.setString(5,"M");
            }
            else
            {
                pstmt.setString(5,"F");
            }
           
            pstmt.executeUpdate();
            
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private boolean isEmptyValidation()
    {
        
        boolean status,male,female;
        
        status=txtfname.getText().isEmpty();
        status=txtlname.getText().isEmpty();
        status=txtmname.getText().isEmpty();
        status=txtemail.getText().isEmpty();
        
        
        male=rbtnmale.isSelected();
        female=rbtnfemale.isSelected();
        
        
        
        if(male || female)
        {
            status=false;
        }
        else
        {
            status=true;
        }
        
     
        return status;
      }
    private void lblnextMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblnextMouseClicked
    {//GEN-HEADEREND:event_lblnextMouseClicked
       
        boolean status,empty;
        

        status=this.isValidEmail(txtemail.getText());
        empty=this.isEmptyValidation();
        
        
       
        
        if(empty)
        {
            JOptionPane.showMessageDialog(this,"Fill the all Information !!!","INFO",JOptionPane.INFORMATION_MESSAGE);
          //  System.out.println("Empty");
        }
        else if(status==false)
        {
            JOptionPane.showMessageDialog(this,"Enter correct email, ' eg- jjbuasa@gmail.com '","Email",JOptionPane.INFORMATION_MESSAGE);
        
                System.out.println("Status of email");
        
        }
        else if(refReg2==null)
        {
             refReg2=new registration2();        // TODO add your handling code here:
        }
        else
        {
           // refReg2.requestFocusInWindow();
             refReg2.requestFocus();
        }
              
            
            
    }//GEN-LAST:event_lblnextMouseClicked

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
               this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_lblcloseMouseClicked

    private void txtfnameKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtfnameKeyTyped
    {//GEN-HEADEREND:event_txtfnameKeyTyped
            char ch;
            ch=evt.getKeyChar();
            
            if(Character.isAlphabetic(ch)==false)
            {
                evt.consume();
            }
    }//GEN-LAST:event_txtfnameKeyTyped

    private void txtmnameKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtmnameKeyTyped
    {//GEN-HEADEREND:event_txtmnameKeyTyped
        char ch;
            ch=evt.getKeyChar();
            
            if(Character.isAlphabetic(ch)==false)
            {
                evt.consume();
            }
    }//GEN-LAST:event_txtmnameKeyTyped

    private void txtlnameKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtlnameKeyTyped
    {//GEN-HEADEREND:event_txtlnameKeyTyped
          char ch;
            ch=evt.getKeyChar();
            
            if(Character.isAlphabetic(ch)==false)
            {
                evt.consume();
            }
    }//GEN-LAST:event_txtlnameKeyTyped

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtemailKeyTyped
    {//GEN-HEADEREND:event_txtemailKeyTyped
                    // TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyTyped


    public static JFrame getFrame()
    {
        
       return registration.reg;
    }
            
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gendergrp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblman;
    private javax.swing.JLabel lblnext;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JRadioButton rbtnfemale;
    private javax.swing.JRadioButton rbtnmale;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmname;
    // End of variables declaration//GEN-END:variables
}
