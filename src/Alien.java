import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Alien extends GameObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	

	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}


	public Alien(int yeet, int yote, int yagga, int gamer) {
		super(yeet, yote, yagga, gamer);
		speed = 1;
		if (needImage) {
		    loadImage ("download.png");
		}
	}
	void update() {
		y+=speed;
		super.update();
	}
	void draw(Graphics g) {
		if(gotImage) {
			g.drawImage(image, x, y, width, height, null);
		}
		else {
			g.setColor(Color.YELLOW);
	        g.fillRect(x, y, width, height);
		}
	}

}
