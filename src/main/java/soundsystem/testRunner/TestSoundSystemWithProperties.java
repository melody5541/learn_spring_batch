package soundsystem.testRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.config.SoundSystemConfig;
import soundsystem.player.CDPlayer;
import soundsystem.player.GuoDanPlayer;
import soundsystem.player.JayChouPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
@ActiveProfiles("dev")
public class TestSoundSystemWithProperties {

    private final static Logger logger = LoggerFactory.getLogger(TestSoundSystemWithProperties.class);

    @Autowired
    private Environment env;

    @Test
    public void playMusic() {
        new GuoDanPlayer().play(env.getProperty("cd.gd.title"),env.getProperty("cd.gd.artist"),env.getProperty("cd.gd.special"));
        new JayChouPlayer().play(env.getProperty("cd.jc.title"),env.getProperty("cd.jc.artist"),env.getProperty("cd.jc.special"));
        new CDPlayer().play();
    }

}
