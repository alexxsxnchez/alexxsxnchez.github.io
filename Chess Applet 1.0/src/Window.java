import javax.swing.*;

/**
 * Created by alexsanchez on 2016-09-17.
 */
public class Window  extends JApplet{
    public void init() {
        add(new JLabel("Hello World"));

    }
    /*private static final int WIDTH = 1097;
    private static final int HEIGHT = 796;
    private int boardSize;
    public void init() {
        setSize(WIDTH, HEIGHT);
        boardSize = getContentPane().getHeight();
        add(new Chessboard(this), JLayeredPane.DEFAULT_LAYER);
        setVisible(true);
    }
    public int getBoardSize() { return boardSize; }
*/
}
