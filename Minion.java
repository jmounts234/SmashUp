import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Minion extends Game
{
	// data fields
	private boolean alive;
	private int power;
	private int type;
	private String faction;
	private File file;
	private BufferedImage img;

	// constructor
	public Minion (int p,int t,String f,String i) 
	{
		power = p;
		alive = true;
		faction = f;
		File file = new File(i);
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int power() 
	{ 
	    return power; 
	}
	public boolean isAlive() 
	{ 
	    return alive; 
	}
	public void kill() 
	{ 
	    alive = ! alive; 
	}
	public File file() 
	{ 
		return file;
	}
	public BufferedImage image() 
	{ 
		return img;
	}
}