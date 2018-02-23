package soundsystem.player;

import org.springframework.stereotype.Service;
import soundsystem.annotation.Jc;

@Service
@Jc
public class JayChouPlayer extends CDPlayer {

    public void play(String title, String artist, String special) {
        JayChouPlayer pLayer = new JayChouPlayer();
        pLayer.setTitle(title);
        pLayer.setArtist(artist);
        pLayer.setSpecial(special);
        pLayer.play();
    }
}
