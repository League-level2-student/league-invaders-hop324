import javax.swing.JFrame;

public class LeagueInvaders {

//The one frame to rule them all//
JFrame frame;
public static final int WIDTH = 500;
public static final int HEIGHT = 800;
GamePanel gamePanel;

public LeagueInvaders() {
	frame = new JFrame();
	gamePanel = new GamePanel();
}

 void setup() {
	frame.add(gamePanel);
	frame.setSize(WIDTH, HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(gamePanel);
	frame.setVisible(true);
}

public static void main(String [] args) {
	new LeagueInvaders().setup();
	//LeagueInvaders().GamePanel();
}
}
