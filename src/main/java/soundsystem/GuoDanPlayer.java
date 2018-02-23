package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("gdPlayer")
public class GuoDanPlayer extends CDPlayer {
}
