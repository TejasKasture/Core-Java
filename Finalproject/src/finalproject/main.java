/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author Administrator
 */
public class main extends javax.swing.JFrame
{

    /**
     * Creates new form main
     */
    public main()
    {
        initComponents();
        
        
        
          BufferedImage img,imgclose;
       try 
       {
        
       img=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\twocolorbackground.jpg"));
//            
            Image dimg;
             dimg=img.getScaledInstance(lblmain.getWidth(),lblmain.getHeight(),Image.SCALE_SMOOTH);
        lblmain.setIcon(new javax.swing.ImageIcon(dimg)); // NOI18N
        lblmain.setLabelFor(lblmain);
        
     
        pnlmain.add(lblmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, pnlmain.getWidth(),pnlmain.getHeight()));
       
           imgclose=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\closebtn.png"));
        
             Image dimg3;
             dimg3=imgclose.getScaledInstance(lblclose.getWidth(),lblclose.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon3=new ImageIcon(dimg3);
             lblclose.setIcon(imageicon3);
       
       
       }
       
       
       catch(Exception e)
       {
       }

        BufferedImage img1,img2,img3,img4;
       
         
        try
        {
            img1=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\addmissonlogo.png"));
            
            Image dimg1;
             dimg1=img1.getScaledInstance(lbladdmission.getWidth(),lbladdmission.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon1=new ImageIcon(dimg1);
             lbladdmission.setIcon(imageicon1);
             
               img2=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\enquirylogo.png"));
            
            Image dimg2;
             dimg2=img2.getScaledInstance(lblenquiry.getWidth(),lblenquiry.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon2=new ImageIcon(dimg2);
             lblenquiry.setIcon(imageicon2);
             
             img3=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\infologo.png"));
        
             Image dimg3;
             dimg3=img3.getScaledInstance(lblinfo.getWidth(),lblinfo.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon3=new ImageIcon(dimg3);
             lblinfo.setIcon(imageicon3);
             
               img4=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\searchlogo.png"));
        
             Image dimg4;
             dimg4=img4.getScaledInstance(lblsearch.getWidth(),lblsearch.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon4=new ImageIcon(dimg4);
             lblsearch.setIcon(imageicon4);
             
            
             
             
             
       
        }
        catch(Exception e)
        {
            
            System.out.println("caught = "+e);
        }
        
         String addmission="""
                               
                               ADMISSION 
                                 PROCESS
                           """;
          String enquiry="""
                               
                                  ENQUIRY
                                  PROCESS
                           """;
          
           String info="""
                             
                              INFORMATION 
                             ABOUT COURSES
                           """;
            String search="""
                               
                                 SEARCH 
                                STUDENTS
                           """;
          
          
          
             
         txtpaddmission.setText(addmission);
         txtenquiry.setText(enquiry);
         txtinfo.setText(info);
         txtsearch.setText(search);
            
        txtpaddmission.setEditable(false);
        txtenquiry.setEditable(false);
        txtinfo.setEditable(false);
        txtsearch.setEditable(false);
        
        
        
        
        
        
        
        
    
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

        pnlmain = new javax.swing.JPanel();
        pnladdmisson = new javax.swing.JPanel();
        lbladdmission = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpaddmission = new javax.swing.JTextPane();
        pnlenquiry = new javax.swing.JPanel();
        lblenquiry = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtenquiry = new javax.swing.JTextPane();
        pnlinfo = new javax.swing.JPanel();
        lblinfo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextPane();
        pnlsearch = new javax.swing.JPanel();
        lblsearch = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtsearch = new javax.swing.JTextPane();
        lblmain = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlmain.setBackground(new java.awt.Color(255, 204, 255));
        pnlmain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnladdmisson.setBackground(new java.awt.Color(255, 255, 255));
        pnladdmisson.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnladdmissonMouseEntered(evt);
            }
        });

        lbladdmission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbladdmission.setText("logo");

        txtpaddmission.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        txtpaddmission.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        txtpaddmission.setFocusable(false);
        jScrollPane1.setViewportView(txtpaddmission);

        javax.swing.GroupLayout pnladdmissonLayout = new javax.swing.GroupLayout(pnladdmisson);
        pnladdmisson.setLayout(pnladdmissonLayout);
        pnladdmissonLayout.setHorizontalGroup(
            pnladdmissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnladdmissonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnladdmissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnladdmissonLayout.createSequentialGroup()
                        .addComponent(lbladdmission, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnladdmissonLayout.setVerticalGroup(
            pnladdmissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnladdmissonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbladdmission, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlmain.add(pnladdmisson, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, 220));

        pnlenquiry.setBackground(new java.awt.Color(255, 255, 255));

        lblenquiry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblenquiry.setText("logo");

        txtenquiry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        txtenquiry.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        txtenquiry.setFocusable(false);
        jScrollPane2.setViewportView(txtenquiry);

        javax.swing.GroupLayout pnlenquiryLayout = new javax.swing.GroupLayout(pnlenquiry);
        pnlenquiry.setLayout(pnlenquiryLayout);
        pnlenquiryLayout.setHorizontalGroup(
            pnlenquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlenquiryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlenquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlenquiryLayout.createSequentialGroup()
                        .addComponent(lblenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlenquiryLayout.setVerticalGroup(
            pnlenquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlenquiryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlmain.add(pnlenquiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 190, 220));

        pnlinfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlinfo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlinfoMouseClicked(evt);
            }
        });

        lblinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblinfo.setText("logo");

        txtinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        txtinfo.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        txtinfo.setFocusable(false);
        txtinfo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txtinfoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(txtinfo);

        javax.swing.GroupLayout pnlinfoLayout = new javax.swing.GroupLayout(pnlinfo);
        pnlinfo.setLayout(pnlinfoLayout);
        pnlinfoLayout.setHorizontalGroup(
            pnlinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlinfoLayout.createSequentialGroup()
                        .addComponent(lblinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlinfoLayout.setVerticalGroup(
            pnlinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlmain.add(pnlinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 190, 220));

        pnlsearch.setBackground(new java.awt.Color(255, 255, 255));

        lblsearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsearch.setText("logo");

        txtsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        txtsearch.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        txtsearch.setFocusable(false);
        jScrollPane4.setViewportView(txtsearch);

        javax.swing.GroupLayout pnlsearchLayout = new javax.swing.GroupLayout(pnlsearch);
        pnlsearch.setLayout(pnlsearchLayout);
        pnlsearchLayout.setHorizontalGroup(
            pnlsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlsearchLayout.createSequentialGroup()
                        .addComponent(lblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        pnlsearchLayout.setVerticalGroup(
            pnlsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlmain.add(pnlsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 190, 220));

        lblmain.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblmainMouseClicked(evt);
            }
        });
        pnlmain.add(lblmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 810, 510));

        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("Close");
        pnlmain.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnladdmissonMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnladdmissonMouseEntered
    {//GEN-HEADEREND:event_pnladdmissonMouseEntered
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_pnladdmissonMouseEntered

    private void lblmainMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblmainMouseClicked
    {//GEN-HEADEREND:event_lblmainMouseClicked
                    // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblmainMouseClicked

    private void pnlinfoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlinfoMouseClicked
    {//GEN-HEADEREND:event_pnlinfoMouseClicked
         //  JFrame info=new newinfo();        // TODO add your handling code here:
    }//GEN-LAST:event_pnlinfoMouseClicked

    private void txtinfoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtinfoMouseClicked
    {//GEN-HEADEREND:event_txtinfoMouseClicked
          JFrame info=new newinfo();           // TODO add your handling code here:
    }//GEN-LAST:event_txtinfoMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbladdmission;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblenquiry;
    private javax.swing.JLabel lblinfo;
    private javax.swing.JLabel lblmain;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JPanel pnladdmisson;
    private javax.swing.JPanel pnlenquiry;
    private javax.swing.JPanel pnlinfo;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JPanel pnlsearch;
    private javax.swing.JTextPane txtenquiry;
    private javax.swing.JTextPane txtinfo;
    private javax.swing.JTextPane txtpaddmission;
    private javax.swing.JTextPane txtsearch;
    // End of variables declaration//GEN-END:variables
}
