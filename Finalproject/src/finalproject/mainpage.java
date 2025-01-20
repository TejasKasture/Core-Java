/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class mainpage extends javax.swing.JFrame
{

    public volatile registration reg;
    public volatile SearchStudent search;
    
    
    public mainpage()
    {
        initComponents();
        
        this.setSize(800,500);
        JFXPanel jfxPanel = new JFXPanel();
        
        jfxPanel.setSize(800, 500);
        add(jfxPanel, BorderLayout.CENTER);
        

        // Initialize JavaFX on the EDT
        Platform.runLater(() -> initFX(jfxPanel));
        BufferedImage img,imgclose;
        
        reg=null;
        search=null;
        
        try
        {
        
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
             
            
         String addmission="""
                               
                               ADMISSION 
                                 PROCESS
                           """;
          String enquiry="""
                               
                                   CREATE
                                  ACCOUNT
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
        catch(Exception e)
        {
            
            System.out.println("caught = "+e);
        }
        
       setVisible(true);

    }
//    private void initFX(JFXPanel jfxPanel) {
//        // Correct the file path to use URI format
//        String videoFile = "file:/C:/Users/Administrator/Documents/NetBeansProjects/Finalproject/src/finalproject/finalimages/animated%20background/4496268-hd_1920_1080_25fps.mp4";
//
//        Media media = new Media(videoFile);
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        MediaView mediaView = new MediaView(mediaPlayer);
//
//        // Create a JavaFX scene with the MediaView
//        Scene scene = new Scene(new javafx.scene.Group(mediaView), 800, 600);
//        jfxPanel.setScene(scene);
//
//        // Start playing the video
//        mediaPlayer.play();
//    }
    
    private void initFX(JFXPanel jfxPanel) {
    // Correct the file path to use URI format
    String videoFile = "file:/C:/Users/Administrator/Documents/NetBeansProjects/Finalproject/src/finalproject/finalimages/animated%20background/4496268-hd_1920_1080_25fps.mp4";

    Media media = new Media(videoFile);
    MediaPlayer mediaPlayer = new MediaPlayer(media);
    MediaView mediaView = new MediaView(mediaPlayer);

    // Set the video to loop continuously
    mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));

    // Create a JavaFX scene with the MediaView
    Scene scene = new Scene(new javafx.scene.Group(mediaView), 800, 600);
    jfxPanel.setScene(scene);

    // Start playing the video
    mediaPlayer.play();
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
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnladdmisson.setBackground(new java.awt.Color(255, 255, 255));
        pnladdmisson.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null));
        pnladdmisson.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnladdmissonMouseEntered(evt);
            }
        });

        lbladdmission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbladdmission.setText("logo");

        txtpaddmission.setBackground(new java.awt.Color(204, 204, 204));
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlenquiry.setBackground(new java.awt.Color(255, 255, 255));
        pnlenquiry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null));

        lblenquiry.setBackground(new java.awt.Color(255, 255, 255));
        lblenquiry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblenquiry.setText("logo");

        txtenquiry.setBackground(new java.awt.Color(204, 204, 204));
        txtenquiry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        txtenquiry.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        txtenquiry.setFocusable(false);
        txtenquiry.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txtenquiryMouseClicked(evt);
            }
        });
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

        pnlinfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlinfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null));
        pnlinfo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlinfoMouseClicked(evt);
            }
        });

        lblinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblinfo.setText("logo");

        txtinfo.setBackground(new java.awt.Color(204, 204, 204));
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

        pnlsearch.setBackground(new java.awt.Color(255, 255, 255));
        pnlsearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null));

        lblsearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsearch.setText("logo");

        txtsearch.setBackground(new java.awt.Color(204, 204, 204));
        txtsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        txtsearch.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        txtsearch.setFocusable(false);
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txtsearchMouseClicked(evt);
            }
        });
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

        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("Close");
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnladdmisson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnladdmisson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnladdmissonMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnladdmissonMouseEntered
    {//GEN-HEADEREND:event_pnladdmissonMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_pnladdmissonMouseEntered

    private void txtinfoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtinfoMouseClicked
    {//GEN-HEADEREND:event_txtinfoMouseClicked
        JFrame info=new newinfo();           // TODO add your handling code here:
    }//GEN-LAST:event_txtinfoMouseClicked

    private void pnlinfoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlinfoMouseClicked
    {//GEN-HEADEREND:event_pnlinfoMouseClicked
        //  JFrame info=new newinfo();        // TODO add your handling code here:
    }//GEN-LAST:event_pnlinfoMouseClicked

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_lblcloseMouseClicked

    private void txtenquiryMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtenquiryMouseClicked
    {//GEN-HEADEREND:event_txtenquiryMouseClicked
           reg=new registration();                    // TODO add your handling code here:
           reg.requestFocus();
    }//GEN-LAST:event_txtenquiryMouseClicked

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtsearchMouseClicked
    {//GEN-HEADEREND:event_txtsearchMouseClicked
           search=new SearchStudent();        // TODO add your handling code here:
           search.requestFocus();
    }//GEN-LAST:event_txtsearchMouseClicked

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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new mainpage().setVisible(true);
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
    private javax.swing.JLabel lblsearch;
    private javax.swing.JPanel pnladdmisson;
    private javax.swing.JPanel pnlenquiry;
    private javax.swing.JPanel pnlinfo;
    private javax.swing.JPanel pnlsearch;
    private javax.swing.JTextPane txtenquiry;
    private javax.swing.JTextPane txtinfo;
    private javax.swing.JTextPane txtpaddmission;
    private javax.swing.JTextPane txtsearch;
    // End of variables declaration//GEN-END:variables
}
