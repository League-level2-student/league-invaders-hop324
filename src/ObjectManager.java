import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
Rocketman Elton;
ArrayList<Projectile> projectile = new ArrayList<Projectile>();
ArrayList<Alien> aliens = new ArrayList<Alien>();
Random randy = new Random();
ObjectManager(Rocketman John){
	Elton = John;
}

void draw(Graphics g) {
	Elton.draw(g);
	for(int i = 0; i < aliens.size(); i ++) {
		aliens.get(i).draw(g);
	}
	
	for(int i = 0; i < projectile.size(); i ++) {
		projectile.get(i).draw(g);
	}
}

void purgeObjects() {
	for(int i = 0; i < aliens.size(); i ++) {
		if(!aliens.get(i).isActive) {
			aliens.remove(i);
		}
	}
	for(int i = 0; i < projectile.size(); i ++) {
		if(!projectile.get(i).isActive) {
			projectile.remove(i);
		}
	}	
}

public void update() {
	for(int i = 0; i < aliens.size(); i ++) {
		aliens.get(i).update();
		if(aliens.get(i).height > LeagueInvaders.HEIGHT) {
			aliens.get(i).isActive = false;
		}
	}
	for(int i = 0; i < projectile.size(); i ++) {
		projectile.get(i).update();
		if(projectile.get(i).height > LeagueInvaders.HEIGHT) {
			projectile.get(i).isActive = false;
		}
	}
}

void addProjectile(Projectile AHH) {
	projectile.add(AHH);
}

void addAlien() {
	aliens.add(new Alien(randy.nextInt(LeagueInvaders.WIDTH),0,50,50));

}

@Override
public void actionPerformed(ActionEvent e) {
	addAlien();	
	System.out.println("Yeet");
}

}
