package package1.service;

import package1.model.InputData;
import package1.model.Rate;
import package1.model.Summary;

import java.util.List;

public interface PrintingService {

    String INTEREST_SUM = "SUMA ODSETEK:  ";
    String OVERPAYMENT_PROVISION = "PROWIZJA ZA NADPLATY: ";
    String LOSTS_SUM = "SUMA STRAT: ";

    String OVERPAYMENT_REDUCE_RATE = "NADPLATA, ZMNIEJSZENIE RATY";
    String OVERPAYMENT_REDUCE_PERIOD = "NADPLATA, SKRÓCENIE OKRESU";
    String OVERPAYMENT_FREQUENCY = "SCHEMAT DOKONYWANIA NADPLAT: ";

    String RATE_NUMBER = "NR:  ";
    String YEAR = "ROK:  ";
    String MONTH = "MIESIĄC:  ";
    String DATE = "DATA:  ";
    String MONTHS = " MIESIĘCY ";
    String RATE = "RATA:  ";
    String INTEREST = "ODSETKI:  ";
    String CAPITAL = "KAPITAŁ:  ";
    String OVERPAYMENT = "NADPLATA: ";
    String LEFT_AMOUNT = "PKWOTA:  ";
    String LEFT_MONTHS = "PMIESIĘCY:  ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU:  ";
    String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA:  ";

    final String CURRENCY = " ZL ";
    final String NEW_LINE = "\n";
    final String PERCENT = "%";


    void printInputDateInfo(final InputData inputData);

    void printRates(List<Rate> rates);

    void printSummary(Summary summary);
}
