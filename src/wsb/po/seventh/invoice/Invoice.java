package wsb.po.seventh.invoice;

import java.util.ArrayList;

/**
   Describes an invoice for a set of purchased products.
*/
public class Invoice
{  
   private Address billingAddress;

   public ArrayList<LineItem> getItems() {
      return items;
   }

   private ArrayList<LineItem> items;

   /**
      Constructs an invoice.
      @param anAddress the billing address
   */
   public Invoice(Address anAddress)
   {  
      items = new ArrayList<LineItem>();
      billingAddress = anAddress;
   }
  
   /**
      Adds a charge for a product to this invoice.
      @param product the product that the customer ordered
      @param quantity the quantity of the product
   */
   public void add(Product product, int quantity)
   {  

   }

   /**
      Formats the invoice.
      @return the formatted invoice
   */
   public String format()
   {  
      String r =  "                     I N V O I C E\n\n";

      return r;
   }

   /**
      Computes the total amount due.
      @return the amount due
   */
   public double getAmountDue()
   {  
      double amountDue = 0;
      return amountDue;
   }
}
