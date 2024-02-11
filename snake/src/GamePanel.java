import javax.swing.*;
import java.util.Random;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JPanel;


public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE; // finds how many units fit in the screen
    static final int DELAY = 75;  // sets the speed of the game
    final int x[] = new int[GAME_UNITS]; // holds all x coordinates
    final int y[] = new int [GAME_UNITS]; // holds all y coordinates
    int bodyParts = 6;
    int applesEaten = 0;
    int appleX;
    int appleY;
    char direction = 'R'; // R-right L-left D-down U-up
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {

    }

    public void startGame() {

    }

    public void paintComponent(Graphics G) {

    }

    public void draw(Graphics G) {

    }

    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
    
}
