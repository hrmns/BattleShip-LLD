package DTO;
import Enum.Players;

import java.util.ArrayList;
import java.util.List;

public class ShipFactory {
    public Ship CreateShip(Players player, Point p){
        if(player==Players.PLAYER1)
        {
            List<Point> list= new ArrayList<>();
            Point p1=p;
            Point p4= new Point(p.getX()+4,p.getY()+4);
            Point p2= new Point(p.getX(),p.getY()+4);
            Point p3= new Point(p.getX()+4,p.getY());
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);
            return new PlayerOneShip(list);
        }
        if(player==Players.PLAYER2)
        {
            List<Point> list= new ArrayList<>();
            Point p1=p;
            Point p4= new Point(p.getX()+4,p.getY()+4);
            Point p2= new Point(p.getX(),p.getY()+4);
            Point p3= new Point(p.getX()+4,p.getY());
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);
            return new PlayerTwoShip(list);
        }
        return null;
    }
}
