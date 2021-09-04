package package1.service;

import package1.model.InputData;
import package1.model.MortgageReference;
import package1.model.Rate;
import package1.model.RateAmounts;

public interface ReferenceCalculationService {

    MortgageReference calculate(InputData inputData);

    MortgageReference calculate(InputData inputData, RateAmounts rateAmounts, Rate previousRate);
}
