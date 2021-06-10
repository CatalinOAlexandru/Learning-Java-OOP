import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    // variables which determinate if the game is running & the score & bricks left
    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;

    // variables to set how fast the ball will move & the speed we will give to the timer
    private Timer timer;
    private int delay = 8;

    // variables for player/pad and ball position & ball moving direction
    // generates a random numbers to spawn the ball
    private int playerX = 310;
    private int ballposX = ThreadLocalRandom.current().nextInt(10, 690 + 1);
    private int ballposY = 350;
    private int[] directionRandom = {-2,2}; // direction and speed of the ball going left or right
    private int ballXdir = directionRandom[new Random().nextInt(directionRandom.length)];
    private int ballYdir = -2; // direction of ball going up with speed 2

    private MapGenerator map;

    public Gameplay(){
        map = new MapGenerator(3, 7); // Number of columns and rows which will be drawn
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    // Will draw the shapes and show them into the game
    public void paint(Graphics g){
        // background
        g.setColor(Color.black);
        g.fillRect(1,1, 692, 592);

        // Calls the draw function and converts it to 2D graphics
        map.draw((Graphics2D)g);

        // borders
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(684,0,3,592);

        // scores
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString(""+score, 590, 30);

        // paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100,8);

        // ball
        g.setColor(Color.yellow);
        g.fillOval(ballposX, ballposY, 20,20);

        if(totalBricks <=0) {
            play = false;
            ballYdir = 0;
            ballXdir = 0;
            g.setColor(Color.yellow);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("You Won", 260, 300);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press Enter to Restart", 230, 350);
        }

        // Checks if the ball felt down, stops the game and display a text
        if(ballposY > 570) {
            play = false;
            ballYdir = 0;
            ballXdir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Game Over, Score: "+score, 190, 300);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press Enter to Restart", 230, 350);
        }

        g.dispose();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play){

            // create a new rectangle around the ball and will checks if it intersects with the another rectangle which is the player
            if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))){
                ballYdir = -ballYdir;
            }

            // Detects if a block was hit by tha ball
            // This goes through each brick to check the
            A: for(int i=0; i<map.map.length; i++){
                for(int j=0; j<map.map[0].length; j++){
                    if(map.map[i][j] > 0) { // if a particular position is 1(one), which means the block is visible it will check for intersection
                        // detect the position of the ball and brick in relation to the bricks sizes
                        int brickX = j*map.brickWidth+80;
                        int brickY = i*map.brickHeight+50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
                        Rectangle brickRect = rect;

                        // check if the ball intersects with the brick or not and will call the setBrickValue() to change its value to 0 (hide it)
                        if(ballRect.intersects(brickRect)){
                            map.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;

                            // Changes the direction of the ball after it hits a brick, other wise the ball will just gro throw and destroy all the bricks on the way
                            if(ballposX+19 <= brickRect.x || ballposX+1 >= brickRect.x + brickRect.width){
                                ballXdir = -ballXdir;
                            }
                            else {
                                ballYdir = -ballYdir;
                            }

                            break A; // breaks the outer loop, instead of breaking only the inner loop
                        }
                    }
                }
            }

            // If play is true, will checks if the ball touches the left,top or right side and will change the direction
            ballposX += ballXdir;
            ballposY += ballYdir;
            if(ballposX < 0){
                ballXdir = -ballXdir;
            }
            if(ballposY < 0){
                ballYdir = -ballYdir;
            }
            if(ballposX > 670){
                ballXdir = -ballXdir;
            }
        }

        repaint(); // Calls paint() to redraw the game
    }


    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    // Checks if Right or left arrow are pressed and calls methods to move he player, only if the player is not already at the edge of the "map"
    // Checks if Enter was pressed and resets the game.
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(playerX >= 580){
                playerX = 580;}
            else {moveRight();}
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(playerX <= 10){
                playerX = 10;}
            else {moveLeft();}
        }

        // If enter is pressed while the game is not played it will restart the game
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(!play) {
                play = true;
                ballposX = ThreadLocalRandom.current().nextInt(10, 690 + 1);
                ballposY = 350;
                ballXdir = directionRandom[new Random().nextInt(directionRandom.length)];
                ballYdir = -2;
                playerX = 310;
                score = 0;
                totalBricks = 21;
                map = new MapGenerator(3,7);

                repaint();
            }
        }
    }

    // Moves player to the right/left by 20 pixels
    public void moveRight(){
        play = true;
        playerX += 20;
    }
    public void moveLeft(){
        play = true;
        playerX -= 20;
    }
}
