/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assgiment_6;

import java.io.IOException;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

/**
 *
 * @author wasat
 */
public class Stars extends Sprite {
    
    private static int WIDTH = 10;
    private static int HEIGHT = 10;
    private static final int FRATE = 15;
    private static final int SPEED = 1;
    private static final int[] SEQUENCE = {0};
    
    public Stars(Image image, int w, int h, int x, int y) throws IOException {
        super(image, w, h);
        
        WIDTH = w;
        HEIGHT = h;
        setFrameSequence(SEQUENCE);
        this.setPosition(x, y);
        
    }
    
    public void advanced(int tick, int w, int h) {
        
        if (tick % FRATE == 0) {
            this.move(0, SPEED);
        }
        if (this.getRefPixelY() > h) {
            this.setRefPixelPosition(w, 0);
        }
    }
    
}
