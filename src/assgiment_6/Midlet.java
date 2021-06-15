/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assgiment_6;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author wasat
 */
public class Midlet extends MIDlet {

    public void startApp() {
        Display.getDisplay(this).setCurrent(new SkyGameCanvas(true));
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
