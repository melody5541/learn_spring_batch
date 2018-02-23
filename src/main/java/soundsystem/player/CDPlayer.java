package soundsystem.player;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import soundsystem.annotation.Cd;

/**
 * 1.在使用自动装配的时候如果一个interface有多个实现，或者一个父类有子类，而返回类型不是对应类型的时候
 * 需要使用@Primary注解标记首选的接口实现类，或者在注入service的时候手动指定返回类型@Qualifier
 */
@Service
@Primary
@Cd
public class CDPlayer implements CompactDisc {

    public  String title = "未知歌曲";
    public  String artist = "未知艺术家";
    public  String special = "未知专辑";


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

