import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.applet.AudioClip;
public class ap extends Applet implements ActionListener {
    private Button playButton;
    private Button stopButton;
    private AudioClip audioClip;

    public void init() {
        playButton = new Button("Play");
        playButton.addActionListener(this);
        add(playButton);
        stopButton = new Button("Stop");
        stopButton.addActionListener(this);
        add(stopButton);
        try {
            // Replace the URL with the path to your audio file
            URL audioURL = new URL(getCodeBase(), "bhajan.wav");
            audioClip = getAudioClip(audioURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton) {
            audioClip.play();
        } else if (e.getSource() == stopButton) {
            audioClip.stop();
        }
    }
}