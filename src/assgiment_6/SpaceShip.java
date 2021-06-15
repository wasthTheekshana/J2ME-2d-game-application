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
    
    
    public void initBullet
    
}
