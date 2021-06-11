
package hotel;
import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

class ReproducirSonidoSystem {
  private BasicPlayer player;
     
    public ReproducirSonidoSystem() throws BasicPlayerException
     {
      player=new BasicPlayer(); 
      player.open(new File(this.getClass().getResource("/Sonidos/Playa.mp3").getFile()));
   
     }
     
     public void stop() throws BasicPlayerException{
         player.stop();
         
     }

     public void reproducir() throws BasicPlayerException{
         player.play();
     }
}
