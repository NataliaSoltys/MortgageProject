package package1.service;

import package1.model.InputData;
import package1.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {

    TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
