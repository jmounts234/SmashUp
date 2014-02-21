import java.awt.Graphics;
import javax.swing.JFrame;

public class Game
{   
	public static void draw (int x, int y, Minion minion)
	{
		//ImageObserver temp = new ImageObserver();
		JFrame frame = new JFrame();
		Graphics g = frame.getGraphics();
		g.drawImage(minion.image(),x,y,null);
	}
	
	public static void main(String[] args)
	{
		int p = 3;
		int t = 1;
		Minion test = new Minion(p,t,"Bears","./BearCavalry.jpg");
		
		draw(0,0,test);
	}
}