package wsb.po.fourth.dataset;

public class BankAccountMeasurer implements Measurer{
    @Override
    public double measure(Object anObject) {
        return ((BankAccount)anObject).getMeasure() * Exchange.toEurRate;
    }
}
