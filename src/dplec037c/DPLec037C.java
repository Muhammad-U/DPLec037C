
package dplec037c;

public class DPLec037C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayerSelector selector=new PlayerSelector();
        Player mp3=selector.getNewPlayer("mp3");
        System.out.println(mp3.nowPlaying("Audio song"));
        Player mp4=selector.getNewPlayer("mp4");
        System.out.println(mp4.nowPlaying("MOVIE"));
    }
    
}
