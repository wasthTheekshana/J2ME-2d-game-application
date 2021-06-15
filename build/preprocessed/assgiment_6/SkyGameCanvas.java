/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assgiment_6;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;

/**
 *
 * @author wasat
 */
public class SkyGameCanvas extends GameCanvas implements Runnable{

        protected GameMange gameManager;
    protected boolean running;
    private int tick = 0;
    private static int WIDTH,HEIGHT;
    private int mDelay = 20;
    public SkyGameCanvas(boolean suppressKeyEvents) throws IOException{
        super(suppressKeyEvents);
         gameManager = new GameMange(5,5,getHeight()-10,getWidth()-10,this);
    }

        public void start() {
            this.running = true;
            Thread t = new Thread(this);
            t.start();
    }

    public void stop() {
        running = false;

    }
        public void render(Graphics g) {
        WIDTH = getWidth();
        HEIGHT = getHeight();
        // Clear the Canvas.
        g.setColor(0, 0, 50);
        g.fillRect(0,0,WIDTH-1,HEIGHT-1);
        // draw border
        g.setColor(200,0,0);
        g.drawRect(0,0,WIDTH-1,HEIGHT-1);
        // draw game canvas
        gameManager.paint(g);
    }
      public void run() {

        while (running) {
            // draw graphics
            render(getGraphics());
            // advance to next graphics
            advance(tick++); 
            // display
            flushGraphics();
            try { Thread.sleep(mDelay); }
            catch (InterruptedException ie) {}
        }
    }

    public void advance(int ticks) {
        // advance to next game canvas
        gameManager.advance(ticks);
        this.paint(getGraphics());
    }
    
}
