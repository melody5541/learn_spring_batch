package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class TestSoundSystem {

    private final static Logger logger = LoggerFactory.getLogger(TestSoundSystem.class);

    @Autowired
    private SgtReppers sgtReppers;

    @Test
    public void playMusic() {
        String specical = "头文字D";
        sgtReppers.setSpecial(specical);
        sgtReppers.play();
    }

}
