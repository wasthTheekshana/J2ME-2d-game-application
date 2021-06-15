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
public class SpaceShip extends Sprite{

    private int RATE = 5;
    protected int speedX = 5;
    protected int speedY = 5;
    private static final int BULLET_SPEED = 10;
    private int WIDTH;
    private int HEIGHT;
    
    private static final int[] SEQUENCE = {0,1,2,3,4,5,6,7};
    private static final int MAX_HP = 1000;
    
    private static final int DAMAGE_RATE = 20;
    private int fireTick =0;
    private int current_HP = MAX_HP;
    private int SHOOT_RATE= 50;
    private boolean destroyed = false;
    private int damageTrick;
    
    private Bullets bullets;
    
    
    
    
    public SpaceShip(Image image, int w, int h) {
        super(image, w, h);
    WIDTH = w;
    HEIGHT = h;
        setFrameSequence(SEQUENCE);
        defineReferencePixel(WIDTH/2, HEIGHT/2);
        this.setTransform(this.TRANS_MIRROR_ROT270);
        
    
    
    }
    
    
    public void initBullet(Image image, int w,int h)throws IOException{
    
        bullets =  new Bullets(image, w, h);
    }
    
    public void advanced(int ticks){
        if (ticks%RATE == 0) {
            nextFrame();
        }
  
    }
       public void moveLeft () {
        if (this.getRefPixelX()>0)
            this.move(-speedX, 0);
    }
    
    public void moveRight (int m) {
        if (this.getRefPixelX() < m)
            this.move(speedX, 0);
    }

    public void moveUp () {
        if (this.getRefPixelY()>0)
            this.move(0, -speedY);
    }
    
    public void moveDown (int m) {
        if (this.getRefPixelY()<m)
            this.move(0, speedY);
    }
    
    public Bullets fire(int ticks){
    
        if (ticks - fireTick > SHOOT_RATE) {
            fireTick = ticks;
            bullets.setSpeed(BULLET_SPEED);
            bullets.shot(this.getRefPixelX(), this.getRefPixelY()+HEIGHT/2);
            return bullets;
        }else
            return null;
    
    }
    
    public void collised(int ticks, int damage){
    
        if (!destroyed) {
            if (ticks > damageTrick+DAMAGE_RATE) {
                current_HP -= damage;
                if (current_HP <= 0) {
                    destroyed = true;
                    damageTrick = ticks;
                }
            }
        }
    
    }
    
    
    public boolean isDetroyed(){
    
        return destroyed;
    
    }
    
    
    public double getHPPrecentage(){
    
        if (!destroyed) {
            return ((double)current_HP/(1.0*MAX_HP));
        }else
            return 0;
    }
    
       public boolean isDamageable(int ticks) {
        return (ticks > damageTrick + DAMAGE_RATE);
    }
    
    public Bullets getBullet() {
        return bullets;
    }
}
