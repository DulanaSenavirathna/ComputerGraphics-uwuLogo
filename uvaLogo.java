import java.awt.*;
import java.awt.event.*;
public class UvaLogo extends Frame
{
    UvaLogo()
    {
        super("Uva Logo");
        setSize(500,500);
        setBackground(new Color(255,255,255));
        show();
        //used to process the window
        addWindowListener(new Close());
    }
    //Graphics - one way to create graphics in Java
    public void paint(Graphics g)
    {

        g.setColor(Color.yellow);
        g.fillOval(200, 160, 100, 100);
        g.setColor(Color.orange);
        g.fillOval(215, 175, 70, 70);

        //leaves
        g.setColor(new Color(56, 134, 8));
        g.fillOval(270, 290, 40, 38);
        g.fillOval(310, 285, 13, 45);
        g.fillOval(310, 320, 35, 10);

        //gray aria
        g.setColor(Color.lightGray);
        int xpoints1[] = {250, 180, 320};
        int ypoints1[] = {210, 330, 330};
        int npoints1 = 3;
        g.fillPolygon(xpoints1, ypoints1, npoints1);


        //blue water line
        g.setColor(Color.blue);
        int xpoints3[] = {148, 171 ,195 ,220,243,258,273,299,328,357,328,299,273,258,243,233,220,195 , 171, 148};
        int ypoints3[] = {225,226,228,235,245,257,274,305,326,333,333,327,313,299,276,259,248,234,228,226};
        int npoints3 = 20;
        g.fillPolygon(xpoints3, ypoints3, npoints3);

        //UWU text behind green
        g.setColor(new Color(33, 134, 9));
        int xpoints2[] = {170, 178, 188};
        int ypoints2[] = {330, 305, 330};
        int npoints2 = 3;
        g.fillPolygon(xpoints2, ypoints2, npoints2);

        int x3[] = {150, 162, 168};
        int y3[] = {330, 305, 330};
        int n3 = 3;
        g.fillPolygon(x3, y3, n3);

        int x4[] = {180, 190, 200};
        int y4[] = {330, 305, 330};
        int n4 = 3;
        g.fillPolygon(x4, y4, n4);


        //UWU text
        g.setColor(new Color(224, 129, 6));
        Font meFont = new Font ("Courier New", Font.BOLD, 35);
        g.setFont (meFont);
        g.drawString("U", 135, 330);
        g.drawString("W", 158, 330);
        g.drawString("U", 190, 330);

       // upper line
        g.setColor(Color.black);
        g.fillRect(134, 335, 190, 2);
        g.setColor(Color.black);
        Font font2 = new Font("Serif", Font.BOLD, 25);
        g.setFont(font2);
        g.drawString("Uva Wellassa",135,360);
        g.drawString("University",160,385);
        // bottom line
        g.fillRect(134, 395, 190, 2);
    }

    public static void main(String args[])
    {
        UvaLogo f1=new UvaLogo();
    }
}


class Close extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
