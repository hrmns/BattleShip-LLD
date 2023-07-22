package DTO;

import java.util.List;
import Enum.ShipStatus;

public class Ship {
    List<Point> points;

    ShipStatus status;
    Ship(List<Point> points){
        this.points=points;
        this.status= ShipStatus.ACTIVE;
    }

    public void destroy(){
        status=ShipStatus.DESTROYED;
    }

    public ShipStatus getStatus() {
        return status;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }
}
