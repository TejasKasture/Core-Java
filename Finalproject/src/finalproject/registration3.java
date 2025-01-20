/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

//import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import practice.panelwebcam;

import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class registration3 extends javax.swing.JFrame implements Runnable
{

     private static JFrame reg2;
     public static JFrame webcam3;
     public static boolean flag=false;
     public static JFrame reg3;
     Thread t;
    public registration3()
    {
        initComponents();
        
         BufferedImage img1,img2,img3;
         reg2=null;
         t=null;
         reg3=this;
       
         
        try
        {
            img1=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\Doted_frame2.png"));
            
            Image dimg1;
             dimg1=img1.getScaledInstance(lblphoto.getWidth(),lblphoto.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon1=new ImageIcon(dimg1);
             lblphoto.setIcon(imageicon1);
             
             img3=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\closebtn.png"));
        
             Image dimg3;
             dimg3=img3.getScaledInstance(lblclose.getWidth(),lblclose.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon3=new ImageIcon(dimg3);
             lblclose.setIcon(imageicon3);
             
             img2=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\left_arrow (2).png"));
           
             Image dimg2;
             dimg2=img2.getScaledInstance(lblback.getWidth(),lblback.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon2=new ImageIcon(dimg2);
             lblback.setIcon(imageicon2);
             
        }
        catch(Exception e)
        {
            
            System.out.println("caught = "+e);
        }
        
        
           // Load items from the database and add "Others" option
    loadComboBoxData();  // <--- Call the method here to populate the combo box
    
    // Set JComboBox to be editable for "Others" input
    cmbhometown.setEditable(true);
        
        this.setVisible(true);
        
        
    }
    
    public static JFrame getReg3()
    {
        return reg3;
    }
    
    public static void addImage(registration3 ref)
    {
        
        System.out.println("-------------->In ADD Image fun<-------------------");
          try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");
            
               int imageid=0;
                
                   String str="SELECT images_id FROM images ORDER BY images_id DESC LIMIT 1";
                    
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
                icon=new ImageIcon(imageData);

                Image img=icon.getImage();
                Image dimg=img.getScaledInstance(ref.lblphoto.getWidth(),ref.lblphoto.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon imageicon=new ImageIcon(dimg);

                ref.lblphoto.setIcon(imageicon);
                

            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(ref, "Error"+e);
        }
    }
            
    
    private void insertNewHometown(String hometown) {
        try {
          java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");      
          String query = "INSERT INTO hometown(hometownname) VALUES (?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, hometown);
            pstmt.executeUpdate();
            
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
    private void loadComboBoxData()
    {
        ArrayList<String> hometowns = new ArrayList<>();
        
        try {
            // Database connection setup (modify based on your DB settings)
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");   
               Statement stmt = con.createStatement();
            String query = "select hometownname from hometown";
            ResultSet rs = stmt.executeQuery(query);
            
            // Fetch data and add to ArrayList
            while (rs.next()) {
                hometowns.add(rs.getString("hometownname"));
            }
            
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Populate the combo box with hometowns from the database
        for (String hometown : hometowns) {
            cmbhometown.addItem(hometown);
        }
        
        // Add "Others" option at the end
        cmbhometown.addItem("Others");
    }
    
    
     public void addDataOFReg3()
    {
       // registration2 ref=(registration2)reg2;
        registration2.addDataOFReg2((registration2) registration2.getFrame());
        
        
        
         try {
          java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Tejas2004@");      
          
           int id=1;
          String queryid="SELECT stdid FROM studentinfo ORDER BY stdid DESC LIMIT 1";
                    
                    Statement st1=con.createStatement();
                    
                    ResultSet rs1;
                    rs1=st1.executeQuery(queryid);
                    
                    if(rs1.next())
                    {
                        id=rs1.getInt(1);
                        
                    } 
          
          String query = "UPDATE studentinfo SET hometown = ?, endate = ?, courses = ?, images_id = ? WHERE stdid = "+id;
            PreparedStatement pstmt = con.prepareStatement(query);
            
           String city=cmbhometown.getSelectedItem().toString();
            pstmt.setString(1,city);
            
            java.util.Date utilDate = dateenquiry.getDate(); // Get the date from the date chooser

            //          Convert java.util.Date to java.sql.Date
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
           
           pstmt.setDate(2, sqlDate);
           
           String courses=getCourses();
           courses=courses.substring(0,courses.length()-1);
           
           pstmt.setString(3, courses);
           
           int imageid=0;
                
                   String str="SELECT images_id FROM images ORDER BY images_id DESC LIMIT 1";
                    
                    Statement st=con.createStatement();
                    
                    ResultSet rs;
                    rs=st.executeQuery(str);
                    
                    if(rs.next())
                    {
                        imageid=rs.getInt(1);
                        
                    } 
                    
            pstmt.setInt(4,imageid);
           
           
        //   String query2="insert into "
           
           pstmt.executeUpdate();
            
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public String getCourses()
     {
         
         String str;
         str=",";
         
         if(chkc.isSelected())
         {
             str="C"+str;
         }
         
         if(chkcpp.isSelected())
         {
             str="CPP"+str;
         }
         
         if(chkds.isSelected())
         {
             str="DS"+str;
         }
         
         if(chkads.isSelected())
         {
             str="ADS"+str;
         }
         
         if(chkjava.isSelected())
         {
             str="JAVA"+str;
         }
         
         if(chkpython.isSelected())
         {
             str="PYTHON"+str;
         }
         
         return str;
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
        dateenquiry = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        cmbhometown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkc = new javax.swing.JCheckBox();
        chkcpp = new javax.swing.JCheckBox();
        chkds = new javax.swing.JCheckBox();
        chkads = new javax.swing.JCheckBox();
        chkjava = new javax.swing.JCheckBox();
        chkpython = new javax.swing.JCheckBox();
        lblphoto = new javax.swing.JLabel();
        lblclick = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        lblback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 71, 94));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        dateenquiry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(196, 166, 123));
        jLabel2.setText("Hometown");

        cmbhometown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbhometown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmbhometown.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmbhometownItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(196, 166, 123));
        jLabel3.setText("Enquiry Date");

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(196, 166, 123));
        jLabel4.setText("Inserested Subject");

        chkc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chkc.setForeground(new java.awt.Color(255, 255, 255));
        chkc.setText("C");

        chkcpp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chkcpp.setForeground(new java.awt.Color(255, 255, 255));
        chkcpp.setText("CPP");
        chkcpp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkcppActionPerformed(evt);
            }
        });

        chkds.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chkds.setForeground(new java.awt.Color(255, 255, 255));
        chkds.setText("DS");
        chkds.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkdsActionPerformed(evt);
            }
        });

        chkads.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chkads.setForeground(new java.awt.Color(255, 255, 255));
        chkads.setText("ADS");

        chkjava.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chkjava.setForeground(new java.awt.Color(255, 255, 255));
        chkjava.setText("JAVA");
        chkjava.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkjavaActionPerformed(evt);
            }
        });

        chkpython.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chkpython.setForeground(new java.awt.Color(255, 255, 255));
        chkpython.setText("PYTHON");
        chkpython.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkpythonActionPerformed(evt);
            }
        });

        lblphoto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblphoto.setForeground(new java.awt.Color(255, 255, 255));
        lblphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto.setText("Photo");

        lblclick.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblclick.setForeground(new java.awt.Color(204, 204, 204));
        lblclick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclick.setText("Click here for Photo");
        lblclick.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblclickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblclickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblclickMouseExited(evt);
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

        btnsubmit.setBackground(new java.awt.Color(196, 166, 123));
        btnsubmit.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsubmitActionPerformed(evt);
            }
        });

        lblback.setBackground(new java.awt.Color(49, 71, 94));
        lblback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblback.setForeground(new java.awt.Color(255, 255, 255));
        lblback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblback.setText("Back");
        lblback.setOpaque(true);
        lblback.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblbackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateenquiry, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addGap(212, 212, 212))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chkds, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(chkads, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbhometown, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chkc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkjava, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkpython, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkcpp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblback, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblclick, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblclick, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbhometown, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkc)
                    .addComponent(chkcpp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkads)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkpython))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkjava)
                        .addGap(26, 26, 26)
                        .addComponent(lblback, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkjavaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkjavaActionPerformed
    {//GEN-HEADEREND:event_chkjavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkjavaActionPerformed

    private void chkcppActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkcppActionPerformed
    {//GEN-HEADEREND:event_chkcppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkcppActionPerformed

    private void chkpythonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkpythonActionPerformed
    {//GEN-HEADEREND:event_chkpythonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkpythonActionPerformed

    private void lblclickMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblclickMouseEntered
    {//GEN-HEADEREND:event_lblclickMouseEntered
        lblclick.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_lblclickMouseEntered

    private void lblclickMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblclickMouseExited
    {//GEN-HEADEREND:event_lblclickMouseExited
       lblclick.setForeground(new Color(204,204,204)); // TODO add your handling code here:
    }//GEN-LAST:event_lblclickMouseExited

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblbackMouseClicked
    {//GEN-HEADEREND:event_lblbackMouseClicked
         if(reg2==null)
        {
         reg2=registration2.getFrame();      // TODO add your handling code here:
        }
        
        //reg1ref.requestFocusInWindow();
        reg2.requestFocus();                    //.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_lblbackMouseClicked

    private void chkdsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkdsActionPerformed
    {//GEN-HEADEREND:event_chkdsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkdsActionPerformed
        
    
    // dispose the Frame 
    public void disposeAllFrame()
    {
        registration.getFrame().dispose();
        registration2.getFrame().dispose();
        this.dispose();
    }
    
   
    
    private boolean isEmptyValidation()
    {
        
        boolean status,hometown,enqdate;
        
        String item=(String) cmbhometown.getSelectedItem();
        
        System.out.println("item = "+item);
        if(item.equals("Select"))
        {
            hometown=true;
        }
        else
        {
            hometown=false;
        }
        
        Date date=dateenquiry.getDate();
        if(date!=null)
       {
           enqdate=false;
       }
       else
       {
           enqdate=true;
       }
        
        System.out.println("hometown = "+hometown);
        System.out.println("enqdate = "+enqdate);
        
        if(hometown || enqdate)
        {
            status=true;  
            System.out.println("true");
        }
        else
        {
            status=false;
        }
        return status;
     
    }
    
    private boolean emptyCourses()
    {
        boolean status=false;
        
        if(chkc.isSelected())
        {
                 status=true;
        }
        
        if(chkcpp.isSelected())
        {
            status=true;
        }
        
        if(chkds.isSelected())
        {
             status=true;
        }
        if(chkads.isSelected())
        {
            status=true;
        }
        
        if(chkjava.isSelected())
        {
            status=true;
        }
        
        if(chkpython.isSelected())
        {
            status=true;
        }
        return status;
 
    }
     
    
    
    
    
    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsubmitActionPerformed
    {//GEN-HEADEREND:event_btnsubmitActionPerformed
                             // TODO add your handling code here:
        boolean empty=isEmptyValidation();
        boolean course=emptyCourses();
        
        
        if(empty)
        {
            JOptionPane.showMessageDialog(this,"Fill the all Information !!!","Info",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(course==false)
        {
            JOptionPane.showMessageDialog(this,"Select atleast one course","Course",JOptionPane.INFORMATION_MESSAGE);
            
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Successfully Saved ","Submit",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        this.addDataOFReg3();
        
        
        this.disposeAllFrame();
        
        
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void lblclickMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblclickMouseClicked
    {//GEN-HEADEREND:event_lblclickMouseClicked
        t=new Thread(this,"webcam");
        t.start();
        System.out.println("STOPPppppppppppppppppp");
        System.out.println("Thread3 name ="+Thread.currentThread().getName());
    }//GEN-LAST:event_lblclickMouseClicked

    private void cmbhometownItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmbhometownItemStateChanged
    {//GEN-HEADEREND:event_cmbhometownItemStateChanged
      if (evt.getStateChange() == ItemEvent.SELECTED)
      {
          
                String selectedItem = cmbhometown.getSelectedItem().toString();
                
                // Check if "Others" was selected
                if (selectedItem.equals("Others")) 
                {
                    // Show input dialog to enter new hometown
                    String newHometown = JOptionPane.showInputDialog(this, "Enter your city", "City", JOptionPane.PLAIN_MESSAGE);

                    // Insert the new hometown before "Others"
                    if (newHometown != null && !newHometown.trim().isEmpty())
                    {
                       cmbhometown.insertItemAt(newHometown, cmbhometown.getItemCount() - 1);
                        cmbhometown.setSelectedItem(newHometown);
                        
                        // Optionally, insert new hometown into the database
                        insertNewHometown(newHometown);
                    }
                }
      }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbhometownItemStateChanged
    
    public void run()
    {
        
        
        webcam3 = panelwebcam.getWebCam();  // Assuming this is a Swing component interaction
        webcam3.requestFocus();
    
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
            java.util.logging.Logger.getLogger(registration3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(registration3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(registration3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(registration3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new registration3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmit;
    private javax.swing.JCheckBox chkads;
    private javax.swing.JCheckBox chkc;
    private javax.swing.JCheckBox chkcpp;
    private javax.swing.JCheckBox chkds;
    private javax.swing.JCheckBox chkjava;
    private javax.swing.JCheckBox chkpython;
    private javax.swing.JComboBox<String> cmbhometown;
    private com.toedter.calendar.JDateChooser dateenquiry;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblclick;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblphoto;
    // End of variables declaration//GEN-END:variables
}
