package package1.service;

import package1.model.InputData;
import package1.model.Overpayment;
import package1.model.Rate;
import package1.model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountsCalculationServiceImpl implements AmountsCalculationService {

    private static final BigDecimal YEAR = BigDecimal.valueOf(12);

    private final ConstantAmountsCalculationService constantAmountsCalculationService;

    private final DecreasingAmountsCalculationService decreasingAmountsCalculationService;

    public AmountsCalculationServiceImpl(
            ConstantAmountsCalculationService constantAmountsCalculationService,
            DecreasingAmountsCalculationService decreasingAmountsCalculationService
    ) {
        this.constantAmountsCalculationService = constantAmountsCalculationService;
        this.decreasingAmountsCalculationService = decreasingAmountsCalculationService;
    }

    @Override
    public RateAmounts calculate(InputData inputData, Overpayment overpayment) {
        switch (inputData.getRateType()){
            case CONSTANT : return constantAmountsCalculationService.calculate(inputData, overpayment);
            case DECREASING: return decreasingAmountsCalculationService.calculate(inputData, overpayment);
            default: throw new MortgageException();
        }
    }

    public RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate) {
        switch (inputData.getRateType()){
            case CONSTANT : return constantAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            case DECREASING: return decreasingAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            default: throw new MortgageException();
        }
    }



}
