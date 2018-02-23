package soundsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soundsystem.config.datasource.DataSourceConfig;

@Configuration
@Import({DataSourceConfig.class,PlayerConfig.class})
public class SoundSystemConfig {
}
