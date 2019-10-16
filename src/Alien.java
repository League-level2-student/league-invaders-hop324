import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{

	public Alien(int yeet, int yote, int yagga, int gamer) {
		super(yeet, yote, yagga, gamer);
		speed = 1;
	}
	void update() {
		y+=speed;
	}
	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
	}

}
