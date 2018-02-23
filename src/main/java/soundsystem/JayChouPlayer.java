package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("JcPlayer")
public class JayChouPlayer extends CDPlayer {

}
