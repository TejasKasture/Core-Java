/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import static finalproject.registration3.reg3;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


/**
 *
 * @author Administrator
 */
public class SearchStudent extends javax.swing.JFrame
{

    /**
     * Creates new form SearchStudent
     */
    public SearchStudent()
    {
        initComponents();
        
        
        
        String[] data={"Tejas Devidas Kasture","9373914200","01-09-2004","23-1-2024","c,cpp,java"};
        
        
     BufferedImage img1,img2,img3;
       
         
        try
        {
            img1=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\download (2).png"));
            
            Image dimg1;
             dimg1=img1.getScaledInstance(lbldownload.getWidth(),lbldownload.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon1=new ImageIcon(dimg1);
             lbldownload.setIcon(imageicon1);
             
       
         
        
            img2=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\Doted_frame2.png"));
            
            Image dimg2;
             dimg2=img2.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon2=new ImageIcon(dimg2);
             lblimage.setIcon(imageicon2);
             
              
             img3=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\closebtn.png"));
        
             Image dimg3;
             dimg3=img3.getScaledInstance(lblclose.getWidth(),lblclose.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon3=new ImageIcon(dimg3);
             lblclose.setIcon(imageicon3);
        }
        catch(Exception e)
        {
            System.out.println("Exception = "+e);
        }
        
    
        setVisible(true);
      
    }
    
    
    public void pdfCreater()throws FileNotFoundException, MalformedURLException
    {
      //    String imgsrc ="C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\images\\phone.jpg";
//        ImageData data=ImageDataFactory.create(imgsrc);
//       
//        
//        com.itextpdf.layout.element.Image image1=new com.itextpdf.layout.element.Image(data);
         String phone=txtphone.getText();
         int len=phone.length();
         if(phone.isEmpty() || len!=10)
         {
             JOptionPane.showMessageDialog(this,"Please Enter Valide Phone Number","Phone No.", JOptionPane.INFORMATION_MESSAGE);
             return ;
         }
        
         String fname=(String) table.getValueAt(0, 0);
        String mname=(String)table.getValueAt(0,1);
        String lname=(String)table.getValueAt(0,2);
        
        String email=(String)table.getValueAt(0,3);
        String courses=(String)table.getValueAt(0,4);
        
        if(fname.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Not Found");
        }
        
       
        
       
            
        String local=txtpanelocal.getText();
        String permnanent=txtpanepermnanent.getText();
        
        com.itextpdf.layout.element.Image image1=null;
        
        
          System.out.println("-------------->In ADD Image fun<-------------------");
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");
            
               int imageid=0;
                
                   String str="SELECT images_id FROM studentinfo where phoneno="+phone;
                    
                    Statement st=con.createStatement();
                    
                    ResultSet rs;
                    rs=st.executeQuery(str);
                    
                    if(rs.next())
                    {
                        imageid=rs.getInt(1);
                        
                    } 
            
            String query="select image_data from images where images_id ="+imageid;

            PreparedStatement pst=con.prepareStatement(query);

            rs=pst.executeQuery();
            byte[] imageData;
            ImageIcon icon;
            

            if(rs.next())
            {
                System.out.println("from result set");
                imageData=rs.getBytes("image_data");
                
                      ImageData data=ImageDataFactory.create(imageData);
       
        
                        image1=new com.itextpdf.layout.element.Image(data);

              //  icon=new ImageIcon(imageData);

              //  Image img=icon.getImage();
              //  com.itextpdf.layout.element.Image image1=icon.getImage();
             //   Image dimg=img.getScaledInstance(ref.lblphoto.getWidth(),ref.lblphoto.getHeight(),Image.SCALE_SMOOTH);
              //  ImageIcon imageicon=new ImageIcon(dimg);

               // ref.lblphoto.setIcon(imageicon);
                

            }
            
              // Specify coordinates (x, y) and dimensions (optional)
        float x = 400;  // X coordinate from the left of the page
        float y = 700;  // Y coordinate from the bottom of the page
        float width = 150;  // Width of the image (optional)
        float height = 300;  // Height of the image (optional)
         
               image1.setFixedPosition(x, y);
               image1.scaleToFit(width, height);
       

        }
        catch(SQLException e)
        {
//            JOptionPane.showMessageDialog(ref, "Error"+e);
        }
        
      

        // Set the fixed position for the image
        
//          img.setFixedPosition(x, y);
//        img.scaleToFit(width, height);
        
           
      
        
        
        String path="pdfs/"+fname+".pdf";
        
        PdfWriter pdfWriter=new PdfWriter(path);
        
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        
        
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document doc=new Document(pdfDocument);
        
     
        
        
        
        String str= "\nName = "+fname+" "+mname+" "+lname+"\nEmail = "+email+"\nCourses = "+courses;
        String localadd="Local Address =  "+local;
        String peradd="Permnanent Address = "+permnanent;
        String dob=" Date of Birth : "+lbldateofbirth1.getText();
        String doe=" Date of Enquiry : "+lbldateofenquiry.getText();
        
        
        doc.add(image1);           
        doc.add(new Paragraph(str+" \n"+localadd+"\n"+peradd+"\n"+dob+"\n"+doe));   
       
        
        
        doc.close();
        
        
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

        jPanel1 = new javax.swing.JPanel();
        txtphone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpanepermnanent = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtpanelocal = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        lbldoq = new javax.swing.JLabel();
        lbldateofenquiry = new javax.swing.JLabel();
        lbldateofbirth1 = new javax.swing.JLabel();
        lbldob1 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        lbldownload = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtphone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtphone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtphoneActionPerformed(evt);
            }
        });
        txtphone.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtphoneKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Phone No.");

        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Fname", "Mname", "Lname", "Email", "Courses"
            }
        ));
        jScrollPane1.setViewportView(table);

        txtpanepermnanent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        txtpanepermnanent.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        txtpanepermnanent.setFocusable(false);
        jScrollPane2.setViewportView(txtpanepermnanent);

        txtpanelocal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        txtpanelocal.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        txtpanelocal.setFocusable(false);
        jScrollPane3.setViewportView(txtpanelocal);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Permnanent  Address");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Local  Address");

        lblimage.setText("jLabel4");

        lbldoq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldoq.setText("Date of Enquiry");

        lbldateofenquiry.setBackground(new java.awt.Color(255, 204, 204));
        lbldateofenquiry.setOpaque(true);

        lbldateofbirth1.setBackground(new java.awt.Color(255, 204, 204));
        lbldateofbirth1.setOpaque(true);

        lbldob1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldob1.setText("Date of Birth");

        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsearchActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btndeleteActionPerformed(evt);
            }
        });

        lbldownload.setText("don");
        lbldownload.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbldownloadMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(75, 75, 75))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(lbldoq)
                                    .addGap(39, 39, 39)
                                    .addComponent(lbldateofenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbldateofbirth1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldownload, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(lbldob1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(678, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldownload, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnsearch)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(lbldateofbirth1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldateofenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldoq))
                                .addGap(57, 57, 57))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(lbldob1)
                    .addContainerGap(376, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private boolean isMobileValide()
    {
        boolean status ;
        
        String number=txtphone.getText();
        
        int len=number.length();
        
        if(len==10)
        {   
            status=true;
            
        }
        else
        {
            status=false;
            
        }
        
        return status;
        
    }
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsearchActionPerformed
    {//GEN-HEADEREND:event_btnsearchActionPerformed
                  
           boolean status=isMobileValide();
           
            
            
            
            
          if(status)
          {
            
               String phoneno=txtphone.getText();
                try
                    {
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");
            Statement st = con.createStatement();
            
            String querydate="select dob,endate,localaddress,permanentaddress,images_id from studentinfo where phoneno="+phoneno;
            
             PreparedStatement pst=con.prepareStatement(querydate);

            ResultSet rs1=pst.executeQuery();
            byte[] imageData;
            ImageIcon icon;
            String dob,endate,local,permananent,id=null;
            

            if(rs1.next())
            {
//                imageData=rs1.getBytes("images_id");
//                icon=new ImageIcon(imageData);
//
//                Image img=icon.getImage();
//                Image dimg=img.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
//                ImageIcon imageicon=new ImageIcon(dimg);
                
                dob=rs1.getString("dob");
                endate=rs1.getString("endate");
                local=rs1.getString("localaddress");
                permananent=rs1.getString("permanentaddress");
                id=rs1.getString("images_id");
                
                       
                
//                lblimage.setIcon(imageicon);
                lbldateofbirth1.setText(dob);
                lbldateofenquiry.setText(endate);
                txtpanelocal.setText(local);
                txtpanepermnanent.setText(permananent);
                 
                System.out.println("helloooooooooooooooooooooooooooo");
                System.out.println("image id = "+id);
                
                        

            }
            
            String imagequery="select image_data from images where images_id ="+id;
            
            PreparedStatement pst1=con.prepareStatement(imagequery);
            ResultSet rs2=pst1.executeQuery();
            if(rs2.next())
            {
                imageData=rs2.getBytes("image_data");
                icon=new ImageIcon(imageData);

                Image img=icon.getImage();
                Image dimg=img.getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon imageicon=new ImageIcon(dimg);
                lblimage.setIcon(imageicon);
            }
            
            rs2.close();
            
            
            String query = "select fname,mname,lname,email,courses from studentinfo where phoneno="+phoneno;
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            int cols = rsmd.getColumnCount();
            String colnames[] = new String[cols];
            for(int i=0;i<cols;i++)
            {
                colnames[i]=rsmd.getColumnName(i+1);
            }
            model.setColumnIdentifiers(colnames);
            String fname,mname,lname,email,courses;
            while(rs.next())
            {
                fname = rs.getString("fname");
                mname = rs.getString("mname");
                lname = rs.getString("lname");
                email = rs.getString("email");
                courses=rs.getString("courses");
                
                String row[] ={fname,mname,lname,email,courses}; 
                model.addRow(row);
            }
            con.close();
            st.close();
        } 
        catch (Exception e)
        {
        } // TODO add your handling code here:

           }
           else
           {
               JOptionPane.showMessageDialog(this,"Enter  the Valide Phone No ","Phone",JOptionPane.PLAIN_MESSAGE);
               txtphone.setText("");
           }
        
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtphoneActionPerformed
    {//GEN-HEADEREND:event_txtphoneActionPerformed
                    // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtphoneKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtphoneKeyTyped
    {//GEN-HEADEREND:event_txtphoneKeyTyped
              char ch;
            ch=evt.getKeyChar();
            
            if(Character.isDigit(ch)==false)
            {
                evt.consume();
            }         // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneKeyTyped

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndeleteActionPerformed
    {//GEN-HEADEREND:event_btndeleteActionPerformed
       
         boolean status=isMobileValide();
         
         
        if(status)
        {
            String phoneno=txtphone.getText();
         try
        {    
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");
            
            
            String querydate="delete from studentinfo where phoneno="+phoneno;
            
             PreparedStatement pst=con.prepareStatement(querydate);
             
             int count;
             
             count=pst.executeUpdate();
                
                if(count>0)
                {
                    JOptionPane.showMessageDialog(this,"Record Deleted Successfully ","Delete",JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                     JOptionPane.showMessageDialog(this,"Their is some error  ","Delete",JOptionPane.PLAIN_MESSAGE);
                }
            
            
            
         }
         catch(Exception e)
         {
         }
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void lbldownloadMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbldownloadMouseClicked
    {//GEN-HEADEREND:event_lbldownloadMouseClicked
        
      //  if()
        {
            try
            {
                pdfCreater();
            }
            catch(FileNotFoundException e)
            {
                      System.out.println("caught = "+e);
            } catch (MalformedURLException ex)
            {
                    Logger.getLogger(PdfCreate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lbldownloadMouseClicked

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_lblcloseMouseClicked

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
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new SearchStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lbldateofbirth1;
    private javax.swing.JLabel lbldateofenquiry;
    private javax.swing.JLabel lbldob1;
    private javax.swing.JLabel lbldoq;
    private javax.swing.JLabel lbldownload;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTable table;
    private javax.swing.JTextPane txtpanelocal;
    private javax.swing.JTextPane txtpanepermnanent;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
