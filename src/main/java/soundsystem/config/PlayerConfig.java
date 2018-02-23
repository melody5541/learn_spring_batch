package soundsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/soundsystem/player.properties")
@ComponentScan("soundsystem.player")
public class PlayerConfig {

//    @Bean
//    @Gd
//    public CompactDisc gdPlayer(){
//        return new GuoDanPlayer();
//    }
//
//    @Bean
//    @Jc
//    public CompactDisc jcPlayer(){
//        return new JayChouPlayer();
//    }
//
//    @Bean
//    @Cd
//    @Primary
//    public CompactDisc cdPlayer(){
//        return new CDPlayer();
//    }

}
