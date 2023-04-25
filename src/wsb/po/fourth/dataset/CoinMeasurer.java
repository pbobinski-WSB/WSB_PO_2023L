package wsb.po.fourth.dataset;

public class CoinMeasurer implements Measurer{
    @Override
    public double measure(Object anObject) {
        return ((Coin)anObject).getMeasure() * Exchange.toPlnRate;
    }
}
