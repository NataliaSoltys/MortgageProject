package package1.service;

import package1.model.InputData;
import package1.model.Rate;

import java.util.List;

public interface RateCalculationService{

    List<Rate> calculate(final InputData inputData);

}
