package package1.service;

import package1.model.Rate;
import package1.model.Summary;

import java.util.List;

public interface SummaryService {

    Summary calculate(List<Rate> rates);

}
