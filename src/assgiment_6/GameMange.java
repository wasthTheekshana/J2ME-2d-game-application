/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assgiment_6;

import java.util.Random;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.LayerManager;

/**
 *
 * @author wasat
 */
public class GameMange extends LayerManager{
    
    //game parameters
    //asteroid
    private Image asteroidImage;
    private static final String ASTEROID_IMAGE ="res/5.png";
    private static final int ASTEROID_WIDTH =50;
    private static final int ASTEROID_HEIGHT =41;
    private static final int ASTEROID_OBS =5; // MAX ASTEROID
    private int OBS_MAX_X_RATE = 3;
    private int OBS_MIN_X_RATE = -3;
    private int OBS_MAX_Y_RATE = 4;
    private int OBS_MIN_Y_RATE = 1;
    
    
    //stars
    private Image starImage;
    private static final String STAR_IMAGE = "res/stars.png";
    private static final int STAR_WIDTH = 10;
    private static final int STAR_HEIGHT = 10;
    private static final int MAX_STARS = 30;
    private static final int OBS_RATE = 30;
    
    //SHIP
    private Image shipImahe;
    private static final String SHIP_IMAGE = "res/blue_ship.png";
    private static final int SHIP_WIDTH = 40;
    private static final int SHIP_HIEGHT = 33;
    
    //bullet Image
    private Image bulletImage;
    private static final String BULLET_IMAGE = "res/shot.png";
    private static final int BULLET_WIDTH = 25;
    private static final int BULLET_HIEGHT = 25;
    
    //gamw window
    
    private int canvasX,canvasY;
    private int leftPosX = 0,leftPosY = 0;
    private int height,width;
    
    //variables and objective
    protected boolean GameOver = false; //game condition
    //score
    private int score = 0;
    //random genaraotr
    private Random r = new Random(System.currentTimeMillis());
    private SkyGameCanvas gameCanvas;
    
    
    
}
