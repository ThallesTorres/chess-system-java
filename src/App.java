import boardgame.Board;
import boardgame.Position;

public class App {
    public static void main(String[] args) throws Exception {
        Position pos = new Position(2, 4);
        System.out.println(pos);

        Board board = new Board(4, 4);
    }
}
