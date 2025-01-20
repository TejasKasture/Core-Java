import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.swing.*;
import java.awt.*;

public class video extends JFrame {

    public video() {
        setTitle("JavaFX Video in Swing");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JFXPanel
        JFXPanel jfxPanel = new JFXPanel();
        add(jfxPanel, BorderLayout.CENTER);

        // Initialize JavaFX on the EDT
        Platform.runLater(() -> initFX(jfxPanel));

        setVisible(true);
    }

    private void initFX(JFXPanel jfxPanel) {
        // Correct the file path to use URI format
        String videoFile = "file:/C:/Users/Administrator/Documents/NetBeansProjects/Finalproject/src/finalproject/finalimages/animated%20background/4496268-hd_1920_1080_25fps.mp4";

        Media media = new Media(videoFile);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Create a JavaFX scene with the MediaView
        Scene scene = new Scene(new javafx.scene.Group(mediaView), 800, 600);
        jfxPanel.setScene(scene);

        // Start playing the video
        mediaPlayer.play();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new video());
        
    }
}
