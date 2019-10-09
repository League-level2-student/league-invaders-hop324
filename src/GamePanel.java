import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
Font titleFont = new Font("Arial", Font.PLAIN, 48);
Font otherFont = new Font("TimesNewRoman", Font.PLAIN, 22);
@Override
public void paintComponent(Graphics g) {
	if(currentState == MENU){
	    drawMenuState(g);
	}else if(currentState == GAME){
	    drawGameState(g);
	}else if(currentState == END){
	    drawEndState(g);
	}
}
final int MENU = 0;
final int GAME = 1;
final int END = 2;

int currentState = MENU;

void updateMenuState() {  }
void updateGameState() {  }
void updateEndState()  {  }

void drawMenuState(Graphics g) { 
	g.setColor(Color.BLUE);
	g.fillRect(0,  0,  LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("Shrek's Swamp", 100, 200);
	g.setFont(otherFont);
	g.drawString("Press SHREK to start", 100, 400);
	g.drawString("Press DONKEY for instructions", 100, 600);
}
void drawGameState(Graphics g) { 
	g.setColor(Color.BLACK);
	g.fillRect(0,  0,  LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
}
void drawEndState(Graphics g)  { 
	g.setColor(Color.RED);
	g.fillRect(0,  0,  LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.BLACK);
	g.drawString("   O   N   I   O   N   S   ", 100, 200);
	g.setFont(otherFont);
	g.drawString("Press ONION to restart", 100, 400);
	g.drawString("Press DONKEY for instructions", 100, 600);
}

}
