/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assgiment_6;

import javax.microedition.lcdui.game.GameCanvas;

/**
 *
 * @author wasat
 */
public class SkyGameCanvas extends GameCanvas implements Runnable{

    
    protected boolean running;
    private int tick = 0;
    private static int WIDTH,HEIGHT;
    private int mDelay = 20;
    public SkyGameCanvas(boolean suppressKeyEvents) {
        super(suppressKeyEvents);
    }

    
    
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
