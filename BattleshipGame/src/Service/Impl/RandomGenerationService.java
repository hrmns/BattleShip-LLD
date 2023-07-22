package Service.Impl;

import DTO.Point;
import Model.GameData;
import Service.GenerationPatternService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomGenerationService implements GenerationPatternService {

    public GameData data;

    RandomGenerationService(GameData data){
        this.data = data;
    }

    @Override
    public List<Point> generatePoint() {
        Random rand= new Random();
        int x= rand.nextInt(0,data.getN()/2);
        int y= rand.nextInt(0,data.getN());
        int x2= rand.nextInt(data.getN()/2,data.getN());
        int y2= rand.nextInt(0,data.getN());
        Point p1= new Point(x,y);
        Point p2= new Point(x2,y2);
        List<Point> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        return list;
    }
}
