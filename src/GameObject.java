import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	int speed = 0;
	boolean isActive = true;
	Rectangle collisionBox;
	
	public GameObject(int yeet, int yote, int yagga, int gamer){
		x = yeet;
		y = yote;
		width = yagga;
		height = gamer;
		collisionBox = new Rectangle();
		collisionBox.setSize(width, height);
		collisionBox.setLocation(x, y);
		
	}
	
	void update() {
     collisionBox.setBounds(x, y, width, height);

	}
	
}
