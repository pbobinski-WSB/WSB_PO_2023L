package wsb.po.fourth.dataset;

/**
   Computes information about a set of data values.
*/
public class DataSet
{
   private double sum;
   private Object maximum;
   private int count;

   private Measurer measurer;

   /**
      Constructs an empty data set.
   */
   public DataSet(Measurer measurer)
   {
      sum = 0;
      count = 0;
      maximum = null;
      this.measurer = measurer;
   }

   /**
      Adds a data value to the data set
      @param x a data value
   */
   public void add(Object x)
   {
      sum = sum + measurer.measure(x);
      if (count == 0 || measurer.measure(maximum) < measurer.measure(x)) maximum = x;
      count++;
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public Object getMaximum()
   {
      return maximum;
   }

   public Measurer getMeasurer () {
      return measurer;
   }
}
