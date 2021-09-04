package package1.service;

import package1.model.InputData;
import package1.model.MortgageResidual;
import package1.model.Rate;
import package1.model.RateAmounts;

public interface ResidualCalculationService {

    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);

}
