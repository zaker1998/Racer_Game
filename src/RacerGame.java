import com.javarush.engine.cell.Game;

public class RacerGame extends Game {
    private final int WIDTH = 64;
    private final int HEIGHT = 64;

    @Override
    public void initialize() {
        setScreenSize(WIDTH,HEIGHT);
        showGrid(false);
    }
}
