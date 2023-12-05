package proyecto;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class EscritorioPersonalizado extends JDesktopPane{
    private BufferedImage img;

    public EscritorioPersonalizado() {
        try 
        {
            img = ImageIO.read(getClass().getResourceAsStream("/icons/logo.png"));
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
    
}