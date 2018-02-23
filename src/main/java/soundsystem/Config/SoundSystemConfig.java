package soundsystem.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceConfig.class,PlayerConfig.class})
public class SoundSystemConfig {
}
