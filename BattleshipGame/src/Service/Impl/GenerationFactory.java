package Service.Impl;

import DTO.Point;
import Enum.GenerationMethod;
import Model.GameData;
import Service.GenerationPatternService;

public class GenerationFactory {
    public GenerationPatternService createPoints(GenerationMethod method, GameData data){
        if(method == GenerationMethod.RANDOM){
            return new RandomGenerationService(data);
        }
        return null;
    }
}
