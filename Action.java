import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Action extends Game
{
	// data fields
	private boolean active;
	private String faction;
	private File file;
	private BufferedImage img;

	// constructor
	public Action (int p,int t,String f,String i) 
	{
		active = true;
		faction = f;
		File file = new File(i);
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public boolean isActive() 
	{ 
	    return active; 
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
