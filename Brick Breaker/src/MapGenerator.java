import java.awt.*;

public class MapGenerator {
    public int map[][]; // will contain all the bricks
    public int brickWidth;
    public int brickHeight;

    // initiate map[][] and adds 1(one) each brick which is shown on the map, 0 will be when it is destroyed
    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }

        // Determinate the brick width and height based on the number of columns and rows required
        brickWidth = 540 / col;
        brickHeight = 150 / row;
    }

    // Bricks will be drawn where the value in map[i][j] is 1(one)
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    // Create spaces (sets a black border) between the blocks
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }
    // Will change the value to 0 on the specific position when a block is hit
    public void setBrickValue(int value, int row, int col){
        map[row][col] = value;
    }
}