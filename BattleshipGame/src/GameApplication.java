import Service.GameService;
import Service.Impl.GameServiceImpl;

public class GameApplication {

    public static void main(String[] args){
        GameService gameService = new GameServiceImpl();
        gameService.initGame(50);
        gameService.addShip();
        gameService.startGame();
    }
}
