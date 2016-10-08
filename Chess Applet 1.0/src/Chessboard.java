import javax.swing.*;
import java.awt.*;

/**
 * Created by alexsanchez on 2016-09-17.
 */
public class Chessboard extends JLayeredPane {
    private int boardSize;
    public Chessboard(Window window) {
        boardSize = window.getBoardSize();
        setSize(new Dimension(boardSize, boardSize));
        JPanel board = new JPanel();
        board.setBackground(Color.BLUE);
        board.setSize(new Dimension(boardSize, boardSize));
        add(board);

    }
}
