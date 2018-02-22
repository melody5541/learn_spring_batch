package soundsystem;

import org.springframework.stereotype.Service;

@Service
public class SgtReppers implements CompactDisc {

    private static String title = "漂移";
    private static String artist = "周杰伦";
    private String special;

//    在构造函数中使用@Autowired传入参数必须是一个Java Bean，不能是基本数据类型
//    @Autowired
//    public SgtReppers(String special) {
//        this.special = special;
//    }

    public void play() {
        System.out.println("play " + title + " by " + artist + " in "+ special);
    }

    public void setSpecial(String special) {
        this.special = special;
    }
}
