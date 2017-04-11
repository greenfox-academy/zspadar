import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.tools.doclint.Entity.image;

/**
 * Created by zsuzsanna.padar on 2017. 04. 11..
 */
public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;

  public Board() {
    testBoxX = 300;
    testBoxY = 300;

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 792));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    int tileSize = 72;
    //graphics.fillRect(testBoxX, testBoxY, 100, 100);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    PositionedImage hero = new PositionedImage("assets/hero-up.png", testBoxX, testBoxY);
    hero.draw(graphics);
    int[] []  floormap = new int[] []{
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}
    };

    int floorMapRow = floormap.length;
    int floorMapColumn = floormap[0].length;
    
    for (int i = 0; i < 720; i += tileSize) {
      for (int j = 0; j < 792; j += tileSize) {
        if( )
        PositionedImage floor = new PositionedImage("assets/floor.png", i , j);
        floor.draw(graphics);
      }
    }

  }


  public static void boardMain() {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }



  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxX -= 72;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 72;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
