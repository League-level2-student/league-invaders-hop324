import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class GamePanel extends JPanel
	implements ActionListener, KeyListener {
Font titleFont = new Font("Arial", Font.PLAIN, 48);
Font otherFont = new Font("TimesNewRoman", Font.PLAIN, 22);

Rocketman rocket = new Rocketman(250, 700, 50, 50);

GamePanel() {
	Timer frameDraw = new Timer(1000/60, this);
	frameDraw.start();
}

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
	rocket.draw(g);
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


public void actionPerformed(ActionEvent e) {
	if(currentState == MENU){
	    updateMenuState();
	}else if(currentState == GAME){
	    updateGameState();
	}else if(currentState == END){
	    updateEndState();
	}
	this.repaint();
	
}

@Override
public void keyTyped(KeyEvent e) {
}

@Override
public void keyPressed(KeyEvent e) {
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == END) {
	        currentState = MENU;
	    } 
	    else {
	        currentState++;
	    }
	}	
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	    rocket.up();
	}
	else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
	    rocket.down();
	}
	else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    rocket.right();
	}
	else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    rocket.left();
	}
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
