/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;


//import java.awt.Image;
//import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javafx.embed.swing.JFXPanel;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
//import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;
//import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class Animatedimage extends javax.swing.JFrame
{

    /**
     * Creates new form Animatedimage
     */
    public Animatedimage()
    {
//        System.setProperty("jna.library.path", "C:\\Program Files\\VideoLAN\\VLC");
//
//        try
//        {
//            initComponents();
//        
//
//
//        EmbeddedMediaPlayerComponent component=new EmbeddedMediaPlayerComponent();
//        
//        this.setContentPane(component);
//     //   pnlmain.add(component,BorderLayout.CENTER);
//       
//        this.addWindowListener(new WindowAdapter(){
//                @Override
//                public void windowClosing(WindowEvent e)
//                {
//                    component.release();
//                    System.exit(0); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//                }
//            
//            
//        
//        });
//        
//        
//         this.setVisible(true);
//          component.mediaPlayer().media().play("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\animated background\\4496268-hd_1920_1080_25fps.mp4");
//        
//        
//        }
//        catch(Exception e)
//        {
//            
//        }
           // Set VLC library path
        
        
        
    System.setProperty("jna.library.path", "C:\\Program Files\\VideoLAN\\VLC");

    try {
        // Initialize components (make sure pnlmain is part of this)
        initComponents();

        // Create the EmbeddedMediaPlayerComponent
        EmbeddedMediaPlayerComponent component = new EmbeddedMediaPlayerComponent();

        // Option 1: If you want to use the media player as the entire content of the frame:
        this.setContentPane(component);

        // Option 2: If you want to add it to pnlmain (comment out setContentPane):
        // pnlmain.setLayout(new BorderLayout());
        // pnlmain.add(component, BorderLayout.CENTER);

        // Add a window listener to release resources when closing
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Release the media player when the window is closing
                component.release();
                System.exit(0);
            }
        });

        // Make the window visible
        this.setVisible(true);

        // Play the media file
        component.mediaPlayer().media().play("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\animated background\\4496268-hd_1920_1080_25fps.mp4");

    } catch (Exception e) {
        // Print any exception that occurs for debugging
        e.printStackTrace();
    }
        
        
              // Create a JFXPanel to integrate JavaFX into Swing
          
//           JFXPanel fxPanel = new JFXPanel();
//            pnlmain.add(fxPanel, BorderLayout.CENTER);
//
//            // Initialize JavaFX content
//            Platform.runLater(() -> {
//                StackPane root = new StackPane();
//                root.getChildren().add(new Label("Hello from JavaFX!"));
//
//                Scene scene = new Scene(root, 800, 600);
//                fxPanel.setScene(scene);
//            });
//        JFXPanel fxPanel = new JFXPanel();
//        pnlmain.add(fxPanel); // Add JFXPanel to your Swing JPanel
//
//        try {
//            // Load and play a video or animation (e.g., MP4)
//            Platform.runLater(() -> {
//                try {
//                    // Set the video file path
//                    String videoPath = new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Finalproject\\src\\finalproject\\finalimages\\animated background\\4496268-hd_1920_1080_25fps.mp4").toURI().toString();
//
//                    // Create a Media object with the video file
//                    Media media = new Media(videoPath);
//
//                    // Create a MediaPlayer for the Media
//                    MediaPlayer mediaPlayer = new MediaPlayer(media);
//
//                    // Create a MediaView to display the video
//                    MediaView mediaView = new MediaView(mediaPlayer);
//
//                    // Optionally scale the media view to fit the panel
//                    mediaView.setFitWidth(pnlmain.getWidth());
//                    mediaView.setFitHeight(pnlmain.getHeight());
//
//                    // Play the media in a loop
//                    mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video/animation
//                    mediaPlayer.play(); // Start playing the animation
//
//                    // Add the media view to a JavaFX pane
//                    StackPane root = new StackPane();
//                    root.getChildren().add(mediaView);
//
//                    // Set the JavaFX scene into the JFXPanel
//                    fxPanel.setScene(new Scene(root, pnlmain.getWidth(), pnlmain.getHeight()));
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Animatedimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Animatedimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Animatedimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Animatedimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Animatedimage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
