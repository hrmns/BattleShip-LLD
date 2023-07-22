package Model;

import DTO.PlayerOneShip;
import DTO.PlayerTwoShip;
import DTO.Point;
import DTO.Ship;

import java.util.HashMap;
import java.util.Map;

public class GameData {
    public final int N;
    public Map<Point, PlayerOneShip> shipsP1;
    public Map<Point, PlayerTwoShip> shipsP2;
    public int shipP1Count;
    public int shipP2Count;


    public GameData(int n) {
        N = n;
        this.shipsP1= new HashMap<>();
        this.shipsP2= new HashMap<>();
    }

    public int getN() {
        return N;
    }

    public Map<Point, PlayerOneShip> getShipsP1() {
        return shipsP1;
    }

    public void setShipsP1(Map<Point, PlayerOneShip> shipsP1) {
        this.shipsP1 = shipsP1;
    }

    public Map<Point, PlayerTwoShip> getShipsP2() {
        return shipsP2;
    }

    public void setShipsP2(Map<Point, PlayerTwoShip> shipsP2) {
        this.shipsP2 = shipsP2;
    }

    public int getShipP1Count() {
        return shipP1Count;
    }

    public void setShipP1Count(int shipP1Count) {
        this.shipP1Count = shipP1Count;
    }

    public int getShipP2Count() {
        return shipP2Count;
    }

    public void setShipP2Count(int shipP2Count) {
        this.shipP2Count = shipP2Count;
    }

    public boolean addShip(Ship ship){

        System.out.println("ship: ");

        for(int i=ship.getPoints().get(3).getX()-4;i<=ship.getPoints().get(3).getX();i++)
            {
                for(int j=ship.getPoints().get(3).getY()-4;j<=ship.getPoints().get(3).getY();j++)
                {
                    if(ship instanceof PlayerOneShip) {
                        System.out.print( "X:"+ i + "Y:" + j + ","  );
                        shipsP1.put(new Point(i,j),(PlayerOneShip)ship);
                    }else if(ship instanceof PlayerTwoShip){
                        System.out.print( "X:"+ i + "Y:" + j + ","  );
                        shipsP2.put(new Point(i,j),(PlayerTwoShip)ship);

                    }
                }
            }
        if(ship instanceof PlayerOneShip)
            shipP1Count++;
        if(ship instanceof PlayerTwoShip)
            shipP2Count++;

        return true;
    }
//    X:0Y:0,X:0Y:1,X:0Y:2,X:0Y:3,X:0Y:4,X:1Y:0,X:1Y:1,X:1Y:2,X:1Y:3,X:1Y:4,X:2Y:0,X:2Y:1,X:2Y:2,X:2Y:3,X:2Y:4,X:3Y:0,X:3Y:1,X:3Y:2,X:3Y:3,X:3Y:4,X:4Y:0,X:4Y:1,X:4Y:2,X:4Y:3,X:4Y:4,ship:
//    X:53Y:0,X:53Y:1,X:53Y:2,X:53Y:3,X:53Y:4,X:54Y:0,X:54Y:1,X:54Y:2,X:54Y:3,X:54Y:4,X:55Y:0,X:55Y:1,X:55Y:2,X:55Y:3,X:55Y:4,X:56Y:0,X:56Y:1,X:56Y:2,X:56Y:3,X:56Y:4,X:57Y:0,X:57Y:1,X:57Y:2,X:57Y:3,X:57Y:4,
}
