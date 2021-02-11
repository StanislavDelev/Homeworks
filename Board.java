package GPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JFrame implements MouseListener {

    JLabel Start;

    public Board() {
        this.setSize(800, 840);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {

                int coordSize = 100;
                int coordX = col * coordSize;
                int coordY = row * coordSize;

                g.setColor(Color.RED);
                g.fillRect(coordX,coordY+30,coordSize,coordSize);
                g.setColor(Color.black);
                g.drawRect(coordX,coordY+30,coordSize,coordSize);

                g.setColor(Color.yellow);
                g.fillRect(0,730,coordSize,coordSize);

                g.setColor(Color.green);
                g.fillRect(100,130,coordSize,coordSize);
                g.setColor(Color.green);
                g.fillRect(300,330,coordSize,coordSize);
                g.setColor(Color.green);
                g.fillRect(100,330,coordSize,coordSize);
                g.setColor(Color.green);
                g.fillRect(200,530,coordSize,coordSize);
                g.setColor(Color.green);
                g.fillRect(600,30,coordSize,coordSize);
                g.setColor(Color.green);
                g.fillRect(500,230,coordSize,coordSize);
                g.setColor(Color.green);
                g.fillRect(600,430,coordSize,coordSize);
                g.setColor(Color.green);
                g.fillRect(600,730,coordSize,coordSize);

                g.setColor(Color.blue);
                g.fillRect(400,130,coordSize,coordSize);
                g.setColor(Color.blue);
                g.fillRect(700,230,coordSize,coordSize);
                g.setColor(Color.blue);
                g.fillRect(0,530,coordSize,coordSize);
                g.setColor(Color.blue);
                g.fillRect(400,630,coordSize,coordSize);
                g.setColor(Color.blue);
                g.fillRect(700,530,coordSize,coordSize);
            }
        }




    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
