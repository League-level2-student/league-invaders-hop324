import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Projectile extends GameObject{
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
	
	public Projectile(int yeet, int yote, int yagga, int gamer) {
		super(yeet, yote, yagga, gamer);
		speed = 10;
		if (needImage) {
		    loadImage ("download.jpg");
		}
	}
	void update() {
		y-=speed;
	}
	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.RED);
			g.fillRect(x, y, width, height);
		}
	}

	
	
}
