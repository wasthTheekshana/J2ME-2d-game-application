/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assgiment_6;

import java.io.IOException;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.TiledLayer;

/**
 *
 * @author wasat
 */
public class BackgroundLay extends TiledLayer{


    public BackgroundLay(int columns, int rows, Image image, int tileWidth, int tileHeight) throws IOException {
        super(1, 1, Image.createImage("res/background.png"), 240, 320);
    }
    
}
