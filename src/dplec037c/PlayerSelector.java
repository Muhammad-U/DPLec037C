
package dplec037c;

public class PlayerSelector {
    public Player getNewPlayer(String playerType){
        if("mp3".equalsIgnoreCase(playerType)){
            return new Audio();
        }
        if("mp4".equalsIgnoreCase(playerType)){
            return new Vedio();
        }
        return null;
    }
}
