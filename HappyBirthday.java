import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
public class HappyBirthday  extends Applet{
public void init(){
	this.resize(1200, 900);
}
public void paint(Graphics g){
	setBackground(Color.red);
	g.setColor(Color.yellow);
	g.fillOval(50, 50, 75, 75);
	g.setColor(Color.black);
	g.fillOval(65, 65, 15, 15);
	g.fillOval(95, 65, 15, 15);
	g.drawOval(90, 63, 25, 25);
	g.drawOval(60, 63, 25, 25);
	g.drawArc(70, 90, 40, 15, 180, 180);
	
	g.setColor(Color.green);
	Font whatever=new Font("anything",Font.BOLD,40);
	setFont(whatever);
	g.drawString("Happy Birthday Vishnu.Enjoy your day", 150, 150);

}
}


