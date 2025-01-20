/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practice;

//import com.github.sarxos.webcam.Webcam;
//import com.github.sarxos.webcam.WebcamException;
//import com.github.sarxos.webcam.WebcamPanel;
//import com.github.sarxos.webcam.WebcamResolution;
import finalproject.registration3;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import javax.swing.*;
import java.sql.*;
import javax.imageio.ImageIO;



/**
 *
 * @author Administrator
 */
public class panelwebcam extends javax.swing.JFrame implements Runnable
{

    /**
     * Creates new form panelwebcam
     */
    private VideoCapture capture;
    private volatile Mat image;
    private volatile Mat imagestore;
     private volatile Mat imagestore2;
    private volatile boolean clicked=false;
    private Thread t;
  //  private Thread t2;
    private volatile boolean start=false;
    private volatile ImageIcon icon;
   private volatile ImageIcon icon2;
   private volatile int cnt=0;
   private static JFrame webcam;
   private Thread img=null;
   
   
    
    
    public panelwebcam()
    {
      
        initComponents();
         System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("loaded successfully"); 
        t=new Thread(this,"Camera");
        this.startThread();
           BufferedImage img1,img3;
           start=true;
       
         
        try
        {
            img1=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\Doted_frame2.png"));
            
            Image dimg1;
             dimg1=img1.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon1=new ImageIcon(dimg1);
             lblimage.setIcon(imageicon1);//          // TODO add your handling code here:
             
            img3=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\closebtn.png"));
        
             Image dimg3;
             dimg3=img3.getScaledInstance(lblclose.getWidth(),lblclose.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon3=new ImageIcon(dimg3);
             lblclose.setIcon(imageicon3);
        }
        catch(Exception e)
        {
        }
        
        this.setVisible(true);
        
     
    }
    
    public static JFrame getWebCam()
    {
         System.out.println("Thraed1 name = "+Thread.currentThread().getName());
        webcam=new panelwebcam();
       System.out.println("Thraed2 name = "+Thread.currentThread().getName());
        return webcam;
      
        
    }
    
    
    
    public void run()
    {

         this.startCamera();
 
       
    }
    
    
    public void startThread()
    {
        t=new Thread(this,"Camera");
        t.start();
        
    }
    
    public void startCamera()
    {
        capture=new VideoCapture(0);
        image = new Mat();
        
        
        byte[] imageData;
        
        
        
        while(start==true)
        {
            //read the image to matrix
          try
          {
            capture.read(image);
            
            
            final MatOfByte buf=new MatOfByte();
            Imgcodecs.imencode(".jpg", image, buf);//stored the image on the disk
            
            imageData=buf.toArray();
            icon=new ImageIcon(imageData);
         //cameraScreen.setIcon(icon);
            if (image.empty()) {
                System.err.println("Captured image is empty!");
                return;
                }
           
            lblcamera.setIcon(icon);
                        
            if(clicked==true)
            {
               
                //Thread.sleep(1000);
                cnt++;
                if(cnt==1)
                {
                    
                 System.out.println("assign");    
                 imagestore=image.clone();
                 int count=0;
                 count++;
                 if(count==1)
                 {
                     imagestore2=imagestore.clone();
                     System.out.println("Image assign to img2");
                 }
                 
                 
                Image img=icon.getImage();
                
                
                
                
               
                Image dimg=img.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon imageicon=new ImageIcon(dimg);
                
               
                lblimage.setIcon(imageicon);
                
                
//                 String name=JOptionPane.showInputDialog(this,"Enter the Name","Image Name",JOptionPane.PLAIN_MESSAGE);
//                
//                
//                if(name==null)
//                {
//                    name=new SimpleDateFormat("yyyy-mm-dd-hh-ss").format(new Date());
//                }
//                
//                if(imagestore.empty())
//                {
//                    System.out.println("nullll------------------------");
//                }
//           
//                
//                Imgcodecs.imwrite("images/"+ name +  ".jpg",imagestore);
              System.out.println("Inner Clicked is  False" + clicked);
                 clicked=false;             
              // start=false ;
                
                Thread.sleep(1000);
                }
          
                System.out.println("outer Clicked is " + clicked);
                clicked=false;
                
               // start=false ;
                
                Thread.sleep(1000);
          
            }
            
            System.out.println("while");
          }
          catch(Exception e)
          {
              System.out.println("Error = "+e);
          }
           
        }
        
        
    }
    
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlmain = new javax.swing.JPanel();
        btnclick = new javax.swing.JButton();
        lblcamera = new javax.swing.JLabel();
        btnset = new javax.swing.JButton();
        lblimage = new javax.swing.JLabel();
        btnagain = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlmain.setBackground(new java.awt.Color(255, 255, 255));

        btnclick.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclick.setText("CLICK");
        btnclick.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnclickActionPerformed(evt);
            }
        });

        lblcamera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblcamera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcamera.setText("Camera");

        btnset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnset.setText("SET");
        btnset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsetActionPerformed(evt);
            }
        });

        lblimage.setBackground(new java.awt.Color(255, 255, 255));
        lblimage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimage.setText("IMAGE");
        lblimage.setOpaque(true);

        btnagain.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnagain.setText("AGAIN");
        btnagain.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnagainActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsaveActionPerformed(evt);
            }
        });

        lblclose.setText("jLabel1");
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
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmainLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnclick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlmainLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblcamera, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlmainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlmainLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnagain, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlmainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        pnlmainLayout.setVerticalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlmainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcamera, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnagain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclick)
                    .addComponent(btnset)
                    .addComponent(btnsave))
                .addGap(19, 19, 19))
        );

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

    private void btnclickActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnclickActionPerformed
    {//GEN-HEADEREND:event_btnclickActionPerformed
        clicked=true;
        cnt=0;
        start=true;
        
        this.startThread();
        System.out.println("btnactionhn");
    // TODO add your handling code here:
    }//GEN-LAST:event_btnclickActionPerformed
/**/
    private void btnagainActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnagainActionPerformed
    {//GEN-HEADEREND:event_btnagainActionPerformed
          BufferedImage img1;
          this.startThread();
       
         
        try
        {
            img1=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\Doted_frame2.png"));
            
            Image dimg1;
             dimg1=img1.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon1=new ImageIcon(dimg1);
             lblimage.setIcon(imageicon1);//          // TODO add your handling code here:
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnagainActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsaveActionPerformed
    {//GEN-HEADEREND:event_btnsaveActionPerformed
        try
        {
        
                String name=JOptionPane.showInputDialog(this,"Enter the Name","Image Name",JOptionPane.PLAIN_MESSAGE);
                
                
                if(name==null)
                {
                    name=new SimpleDateFormat("yyyy-mm-dd-hh-ss").format(new Date());
                }
                
                if(imagestore.empty())
                {
                    System.out.println("img1nullll------------------------");
                }
                if(imagestore2.empty())
                {
                    System.out.println("img2nullll------------------------");
                }
           
                Imgcodecs.imwrite("images/"+ name +  ".jpg",imagestore2); // this function will store the image in that folder
                FileInputStream fileInputStream= new FileInputStream("images/"+ name +".jpg");
                
                byte[] imagebinary= new byte[fileInputStream.available()];
                fileInputStream.read(imagebinary); // binary conversion
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");
                String query="insert into images(image_data) values(?)";
                
                PreparedStatement pst=con.prepareStatement(query);
                
                pst.setBytes(1,imagebinary);
                int rows=pst.executeUpdate();
                
                if(rows>0)
                {
                    System.out.println("image is added");
       
                }
                else
                {
                    System.out.println("Not added");
                }                 // TODO add your handling code here:
                    
          //    this.startThread();
          
//                 this.stopCameraAndDispose();
//                start=false;
//                capture=null;
       
          
         registration3.flag=true;
         
           registration3.addImage((registration3) registration3.getReg3());
           
               
        }
        catch(Exception e)
        {
            System.out.println("caught ="+e);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnsetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsetActionPerformed
    {//GEN-HEADEREND:event_btnsetActionPerformed

        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");
            String query="select image_data from images where images_id ="+1;

            PreparedStatement pst=con.prepareStatement(query);

            ResultSet rs=pst.executeQuery();
            byte[] imageData;
            ImageIcon icon;

            if(rs.next())
            {
                imageData=rs.getBytes("image_data");
                icon=new ImageIcon(imageData);

                Image img=icon.getImage();
                Image dimg=img.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon imageicon=new ImageIcon(dimg);

                lblimage.setIcon(imageicon);

            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Error"+e);
        }
    }//GEN-LAST:event_btnsetActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
               // this.dispose();        // TODO add your handling code here:
            this.stopCameraAndDispose();
            start=false;
            capture=null;
            this.dispose();
            
         
         //   System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked
        private void stopCameraAndDispose() 
        {
        start = false;  // Stop the camera loop
        if (capture != null && capture.isOpened()) {
            capture.release();  // Release the webcam resource
        }
        if (t != null && t.isAlive()) {
            try {
                t.join();  // Wait for the thread to stop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Camera stopped and resources released.");
        dispose();  // Dispose of the JFrame
    }
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
            java.util.logging.Logger.getLogger(panelwebcam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(panelwebcam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(panelwebcam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(panelwebcam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new panelwebcam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagain;
    private javax.swing.JButton btnclick;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnset;
    private javax.swing.JLabel lblcamera;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblimage;
    private javax.swing.JPanel pnlmain;
    // End of variables declaration//GEN-END:variables
}
