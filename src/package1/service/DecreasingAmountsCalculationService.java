package package1.service;

import package1.model.InputData;
import package1.model.Overpayment;
import package1.model.Rate;
import package1.model.RateAmounts;

public interface DecreasingAmountsCalculationService {
    RateAmounts calculate(InputData inputData, Overpayment overpayment);

    RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
