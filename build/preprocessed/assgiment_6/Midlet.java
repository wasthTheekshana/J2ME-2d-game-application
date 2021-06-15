/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assgiment_6;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.midlet.*;

/**
 * @author wasat
 */
public class Midlet extends MIDlet implements CommandListener{
    private SkyGameCanvas gameCanvas ;
    private Command exitCommand ;
    private Player player = null;

    public void startApp() {
        try {
                 gameCanvas = new SkyGameCanvas(true);
            gameCanvas.start(); // start game thread
            exitCommand = new Command("Exit",Command.EXIT,1);
            gameCanvas.addCommand(exitCommand);
            gameCanvas.setCommandListener(this);
            Display.getDisplay(this).setCurrent(gameCanvas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
           try {
            // start sounds
            InputStream in = getClass().getResourceAsStream("/res/startfly.wav");
            player = Manager.createPlayer(in,"audio/x-wav");
            player.setLoopCount(1);
            player.start();

        } catch (MediaException ex) {
            ex.printStackTrace();
        }
         catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
              if (player != null) {
            player.close();
        }
        System.gc();
    }

    public void commandAction(Command command, Displayable d) {
         if (command == exitCommand) {
            destroyApp(true);
            notifyDestroyed();
        }
    }
}
