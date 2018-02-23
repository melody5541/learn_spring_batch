package soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("cdPlayer")
@Primary
public class CDPlayer implements CompactDisc{

    public String title = "未知歌曲";
    public String artist = "未知艺术家";
    public String special = "未知专辑";


    public void play() {

        System.out.println("play " + title + " by " + artist + " in " + special);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
}
