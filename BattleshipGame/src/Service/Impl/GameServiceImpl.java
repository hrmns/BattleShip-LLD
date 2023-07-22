package Service.Impl;

import DTO.PlayerOneShip;
import DTO.PlayerTwoShip;
import DTO.Point;
import DTO.ShipFactory;
import Model.GameData;
import Service.GameService;
import Enum.Players;
import Enum.GenerationMethod;
import Enum.ShipStatus;

import java.util.List;

public class GameServiceImpl implements GameService {

    public GameData data;
    public GenerationFactory generationFactory;
    public ShipFactory shipFactory;

    @Override
    public void initGame(int N) {
        data= new GameData(N);
        generationFactory= new GenerationFactory();
        shipFactory= new ShipFactory();
    }

    @Override
    public void addShip() {
        PlayerOneShip p1Ship= (PlayerOneShip)shipFactory.CreateShip(Players.PLAYER1,new Point(0,0));
        PlayerTwoShip p2Ship= (PlayerTwoShip)shipFactory.CreateShip(Players.PLAYER2,new Point((data.getN()/2)+3,0));
        data.addShip(p1Ship);
        data.addShip(p2Ship);
    }

    @Override
    public void startGame() {
        while(true)
        {
            List<Point> points=generationFactory.createPoints(GenerationMethod.RANDOM, data).generatePoint();
            System.out.println("Player 1 des " + points.get(0).getX() + ", "+ points.get(0).getY() + ". Player 2 des " + points.get(1).getX() + ", "+ points.get(1).getY());

            if(data.getShipsP1().containsKey(points.get(0))){
                PlayerOneShip p1=data.getShipsP1().get(points.get(0));
                if(p1.getStatus()!= ShipStatus.DESTROYED)
                {
                    p1.destroy();
                    data.shipP1Count--;
                    if(data.shipP1Count==0)
                    {
                        System.out.println("Player 2 won");
                        return;
                    }
                }
            }
            if(data.getShipsP2().containsKey(points.get(1))){
                PlayerTwoShip p2=data.getShipsP2().get(points.get(1));
                if(p2.getStatus()!= ShipStatus.DESTROYED)
                {
                    p2.destroy();
                    data.shipP2Count--;
                    if(data.shipP2Count==0)
                    {
                        System.out.println("Player 1 won");
                        return;
                    }
                }
            }
//           if(points.get(0).getX()<=4 && points.get(0).getY()<4)
//           {
//               System.out.println(data.getShipsP1().containsKey(points.get(0)));
//               for(var x : data.getShipsP1().entrySet()){
//                   System.out.println(x.getKey().getX() + " " + x.getKey().getY());
//               }

           //}
        }
    }

    @Override
    public void viewBattleField() {

    }
}
