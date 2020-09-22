
package dplec037c;

public class Audio implements Player{
    String results="Simple ";

    @Override
    public String nowPlaying(String content) {
        return content+" is now playing in Audio Settings";
    }
}
