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

/**
 *
 * @author Administrator
 */
public class newinfo extends javax.swing.JFrame
{

    /**
     * Creates new form newinfo
     */
    public newinfo()
    {
        initComponents();
        setVisible(true);
        
             String c="""
                 * This is 'C' Language  
                   having duration of  3 Months 
                 * Fees Structure is 3500/- only
                 * Timing 7.45-9.30 PM
                 * Every Sunday Practical
                 """;
        String cpp="""
                   * This is 'C++' Language
                     having duration of  3-4 Months
                   * Fees Structure  is 4400/- only
                   * Timing 7.45-9.45 PM
                   * Every Sunday Practical
                   """;
        String ds="""
                   * This 'Data Structure'
                     having duration of  2 Months
                   * Fees Structure  is 4500/- only
                   * Timing 7.45-9.45 PM
                   * Every Sunday Practical ,Max 2 practical in week
                   * Whole Data Structure will be taking in C++ only  
                   * Prerequisites is C++
                   """;
        String ads="""
                   * This 'Advanced Data Structure'
                     having duration of  4 Months
                   * Fees Structure  is 5000/- only
                   * Timing 5.45-7.45 PM
                   * Every Sunday Practical
                   * Whole Advanced Data Structure will be taking in C++ only  
                   * Prerequisites are Data Structure and  C++
                   * Placement Preparation
                   """;
        String java="""
                   * This is 'JAVA' Language
                     having duration of  3-4 Months
                   * Fees Structure  is 4400/- only
                   * Timing 5.45-7.45 PM
                   * Every Sunday Practical
                   * At the End of Course we will do Project
                   """;
        String python="""
                   * This is 'PYTHON' Language
                     having duration of  3 Months
                   * Fees Structure  is 4400/- only
                   * Timing 7.45-9.45 PM
                   * Every Sunday Practical
                   """;
                 
        
        txtpanec.setText(c);
        txtpanecpp.setText(cpp);
        txtpaneds.setText(ds);
        txtpaneads.setText(ads);
        txtpanejava.setText(java);
        txtpanepython.setText(python);
        
        txtpanec.setEditable(false);
        txtpanecpp.setEditable(false);
        txtpaneds.setEditable(false);
        txtpaneads.setEditable(false);
        txtpanejava.setEditable(false);
        txtpanepython.setEditable(false);
                
         BufferedImage img1,img2,img3;
       
         
        try
        {
            img1=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\miceman.png"));
            
            Image dimg1;
             dimg1=img1.getScaledInstance(lblmanout.getWidth(),lblmanout.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon1=new ImageIcon(dimg1);
             //lblman.setIcon(imageicon1);
             //lblmanads.setIcon(imageicon1);
             lblmanout.setIcon(imageicon1);
             
             img3=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\closebtn.png"));
        
             Image dimg3;
             dimg3=img3.getScaledInstance(lblclose.getWidth(),lblclose.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon imageicon3=new ImageIcon(dimg3);
             lblclose.setIcon(imageicon3);
             
                    img2=ImageIO.read(new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\twocolorbackground.jpg"));
//            
            Image dimg2;
             dimg2=img2.getScaledInstance(lblbackground.getWidth(),lblbackground.getHeight(),Image.SCALE_SMOOTH);
        lblbackground.setIcon(new javax.swing.ImageIcon(dimg2)); // NOI18N
        lblbackground.setLabelFor(lblbackground);
        
     
        pnlmain.add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, pnlmain.getWidth(),pnlmain.getHeight()));
       }
       catch(Exception e)
       {
       }
             
             
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpanec = new javax.swing.JTextPane();
        pnlcpp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpanecpp = new javax.swing.JTextPane();
        pnlds = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtpaneds = new javax.swing.JTextPane();
        pnlads = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtpaneads = new javax.swing.JTextPane();
        pnljava = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtpanejava = new javax.swing.JTextPane();
        pnlpython = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtpanepython = new javax.swing.JTextPane();
        lblmanout = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlmain.setBackground(new java.awt.Color(255, 255, 255));
        pnlmain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 204));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane1.setName("C"); // NOI18N
        jTabbedPane1.setOpaque(true);

        pnlc.setBackground(new java.awt.Color(196, 166, 123));

        txtpanec.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpanec.setDragEnabled(true);
        jScrollPane1.setViewportView(txtpanec);

        javax.swing.GroupLayout pnlcLayout = new javax.swing.GroupLayout(pnlc);
        pnlc.setLayout(pnlcLayout);
        pnlcLayout.setHorizontalGroup(
            pnlcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlcLayout.setVerticalGroup(
            pnlcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("C", pnlc);

        pnlcpp.setBackground(new java.awt.Color(196, 166, 123));

        txtpanecpp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(txtpanecpp);

        javax.swing.GroupLayout pnlcppLayout = new javax.swing.GroupLayout(pnlcpp);
        pnlcpp.setLayout(pnlcppLayout);
        pnlcppLayout.setHorizontalGroup(
            pnlcppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcppLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlcppLayout.setVerticalGroup(
            pnlcppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcppLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CPP", pnlcpp);

        pnlds.setBackground(new java.awt.Color(196, 166, 123));

        txtpaneds.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(txtpaneds);

        javax.swing.GroupLayout pnldsLayout = new javax.swing.GroupLayout(pnlds);
        pnlds.setLayout(pnldsLayout);
        pnldsLayout.setHorizontalGroup(
            pnldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnldsLayout.setVerticalGroup(
            pnldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DS", pnlds);

        pnlads.setBackground(new java.awt.Color(196, 166, 123));

        txtpaneads.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jScrollPane4.setViewportView(txtpaneads);

        javax.swing.GroupLayout pnladsLayout = new javax.swing.GroupLayout(pnlads);
        pnlads.setLayout(pnladsLayout);
        pnladsLayout.setHorizontalGroup(
            pnladsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnladsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnladsLayout.setVerticalGroup(
            pnladsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnladsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADS", pnlads);

        pnljava.setBackground(new java.awt.Color(196, 166, 123));

        txtpanejava.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jScrollPane5.setViewportView(txtpanejava);

        javax.swing.GroupLayout pnljavaLayout = new javax.swing.GroupLayout(pnljava);
        pnljava.setLayout(pnljavaLayout);
        pnljavaLayout.setHorizontalGroup(
            pnljavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljavaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnljavaLayout.setVerticalGroup(
            pnljavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljavaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("JAVA", pnljava);

        pnlpython.setBackground(new java.awt.Color(196, 166, 123));

        txtpanepython.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jScrollPane6.setViewportView(txtpanepython);

        javax.swing.GroupLayout pnlpythonLayout = new javax.swing.GroupLayout(pnlpython);
        pnlpython.setLayout(pnlpythonLayout);
        pnlpythonLayout.setHorizontalGroup(
            pnlpythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpythonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlpythonLayout.setVerticalGroup(
            pnlpythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpythonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PYTHON", pnlpython);

        pnlmain.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 590, 350));

        lblmanout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmanout.setText("man");
        pnlmain.add(lblmanout, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 125, 220, 370));

        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("close");
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });
        pnlmain.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 10, 70, 60));
        pnlmain.add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 500));

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
            java.util.logging.Logger.getLogger(newinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(newinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(newinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(newinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new newinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmanout;
    private javax.swing.JPanel pnlads;
    private javax.swing.JPanel pnlc;
    private javax.swing.JPanel pnlcpp;
    private javax.swing.JPanel pnlds;
    private javax.swing.JPanel pnljava;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JPanel pnlpython;
    private javax.swing.JTextPane txtpaneads;
    private javax.swing.JTextPane txtpanec;
    private javax.swing.JTextPane txtpanecpp;
    private javax.swing.JTextPane txtpaneds;
    private javax.swing.JTextPane txtpanejava;
    private javax.swing.JTextPane txtpanepython;
    // End of variables declaration//GEN-END:variables
}
