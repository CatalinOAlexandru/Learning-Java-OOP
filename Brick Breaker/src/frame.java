import javax.swing.*;

public class frame extends JFrame {

    // creates & set-up the window frame and adds the game in it
    frame() {
        Gameplay gamePlay = new Gameplay();
        setBounds(100, 100, 700, 600);
        setTitle("Brick Breaker");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(gamePlay);
    }

    public static void main(String[] args){
        new frame();
    }
}
