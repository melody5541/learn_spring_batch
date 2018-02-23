package soundsystem.player;

import org.springframework.stereotype.Service;
import soundsystem.annotation.Gd;

@Service
@Gd
public class GuoDanPlayer extends CDPlayer {

    public void play(String title,String artist,String special){
        GuoDanPlayer pLayer = new GuoDanPlayer();
        pLayer.setTitle(title);
        pLayer.setArtist(artist);
        pLayer.setSpecial(special);
        pLayer.play();
    }
}
