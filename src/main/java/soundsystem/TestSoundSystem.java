package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
@ActiveProfiles("dev")
public class TestSoundSystem {

    private final static Logger logger = LoggerFactory.getLogger(TestSoundSystem.class);

    @Autowired
    @Gd
    private CompactDisc compactDisc;

    @Test
    public void playMusic() {
        CDPlayer pLayer = new CDPlayer();
        if (compactDisc instanceof GuoDanPlayer) {
            pLayer  = new GuoDanPlayer();
            pLayer.setTitle("外面有点冷");
            pLayer.setArtist("国蛋");
            pLayer.setSpecial("Blue Dream");
        } else if (compactDisc instanceof JayChouPlayer) {
            pLayer = new JayChouPlayer();
            pLayer.setTitle("漂移");
            pLayer.setArtist("周杰伦");
            pLayer.setSpecial("头文字D");
        }
        pLayer.play();
    }

}
