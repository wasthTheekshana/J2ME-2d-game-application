/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assgiment_6;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

/**
 *
 * @author wasat
 */
public class Bullets extends Sprite{

    private boolean active = true; 
    
    private int xDirection = 0;
    private int yDirection = 0;
    
    private static int HEIGHT = 25;
    private static int WIDTH = 25;
    private int[] SEQUENCE;
    private static final int FRATE = 1;
     
    public Bullets(Image image, int w, int h) {
        super(image, w, h);
        
        WIDTH = w;
        HEIGHT = h;
        defineReferencePixel(WIDTH/2, HEIGHT/2);
    }

    public Bullets(Image image, int w, int h,int x, int y, int xDirection, int yDirection) {
        super(image, w, h);
        WIDTH = w;
        HEIGHT = h;
        setFrameSequence(SEQUENCE);
        defineReferencePixel(WIDTH/2, HEIGHT/2);
        this.xDirection = xDirection;
        this.yDirection = yDirection;
        this.setRefPixelPosition(x, y);
    }
    
    public void setSpeed(int speed){
    
        this.yDirection = speed;
    
    }
    
    public int getSpeed(){
    return this.yDirection;
    }
    
    //bullet rate
    public void advanced(int tick){
        if (tick%FRATE == 0 && active == true) {
                if (this.getRefPixelY() > 0) {
                this.move(xDirection, -yDirection);           
            }else{
        super.setVisible(false);
        active =false;
        }
        }
    }
    
    
    public void shot(int w , int h){
    active = true;
    this.setRefPixelPosition(w, h);
    this.setVisible(true);
    
    }
    
    public boolean isAppear(){
    return active;
    }
    
    public void destroy(){
    
        super.setVisible(false);
        active = false;
    
    }
}
