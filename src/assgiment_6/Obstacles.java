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
public class Obstacles extends Sprite{

    public boolean appear = true;
    public boolean destroyable = true;
    private static final int damage = 150;
    private static final int score = 100;
    public static int WIDTH = 50;
    public static int HEIGHT = 41;
    
    protected int speedX,speedY;
    private int direction;
    protected int FRATE = 2;

  
    public Obstacles(Image image, int w, int h) throws IOException{
        super(image, w, h);
        WIDTH = w;
        HEIGHT = h;
        defineReferencePixel(WIDTH/2, HEIGHT/2);
    }

    public Obstacles(Image image, int w, int h, int x, int y,boolean  destroy) throws IOException{
        super(image, w, h);
          WIDTH = w;
        HEIGHT = h;
        defineReferencePixel(WIDTH/2, HEIGHT/2);
        speedX = x;
        speedY = y;
       destroyable = destroy;
    }
    
    public Obstacles(Image image, int w, int h, int x, int y,boolean  destroy, int sx) throws IOException{
        super(image, w, h);
          WIDTH = w;
        HEIGHT = h;
        defineReferencePixel(WIDTH/2, HEIGHT/2);
        speedX = x;
        speedY = y;
       destroyable = destroy;
       this.setRefPixelPosition(sx, -HEIGHT);
    }
    
    
    public Obstacles(String name, int w, int h, int x, int y,boolean  destroy, int sx) throws IOException{
        super(Image.createImage(name), w, h);
        defineReferencePixel(w/2, h/2);
        speedX = x;
        speedY = y;
       destroyable = destroy;
       this.setRefPixelPosition(sx, -h);
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }


    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public int getDirection() {
        return direction;
    }

    public void advanced(int tick,int x, int y) {
        if (appear) {
            if (tick%FRATE ==0) {
                this.move(speedX, speedY);
                
            }
            if ((this.getX() > (x+ WIDTH)) || (x < 0) || (this.getY() > (y + HEIGHT))) {
                destroy();
                
            }
        }
    }

    public void reAppear(int x, int y, boolean d, int sx){
    speedX = x;
    speedY = y;
    destroyable =d;
    this.setRefPixelPosition(sx, -HEIGHT);
    this.setVisible(true);
    appear = true;
    
    }
    
    
    private void destroy() {
      super.setVisible(false);
      appear = false;
    }
    
    public boolean isApear(){
    return appear;
    }

    public static int getDamage() {
        return damage;
    }

    public static int getScore() {
        return score;
    }
    
    
    
    
}
