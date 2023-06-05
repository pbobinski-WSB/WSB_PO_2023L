package wsb.po.seventh.invoice;

/**
   Describes a quantity of an article to purchase.
*/
public class LineItem
{  
   private int quantity;
   private Product theProduct;

   /**
      Constructs an item from the product and quantity.
      @param product the product
      @param quantity the item quantity
   */
   public LineItem(Product product, int quantity)
   {  
      theProduct = product;
      this.quantity = quantity;
   }
   
   /**
      Computes the total cost of this line item.
      @return the total price
   */
   public double getTotalPrice()
   {  

      return 0;
   }
   
   /**
      Formats this item.
      @return a formatted string of this item
   */
   public String format()
   {  
      return String.format("");
   }
}
