import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
private static final int MAX_ITEMS = 100;
  
private static String[] itemNames = new String[MAX_ITEMS];
private static int[] quantityOfItem = new int[MAX_ITEMS];
  
  
public static void addItem(String itemName, int quantity) {
  for (int i = 0; i < itemNames.length; i++) {
  if (itemNames[i] == null) {
  itemNames[i] = itemName;
    quantityOfItem[i] = quantity;
    System.out.println( itemName + "added to the catalog with quantity" + quantity + ".");
    return();
    }
  }
  System.out.println("Catalog is full");
}

public static void removeItem(String itemName, int quantity) {
  for (int i = 0; i < itemNames.length; i++) {
    if (itemName.equals(itemNames[i])) {
      quantityOfItem[i] -= quantity;
      if (quantityOfItem[i]<0){
        quantityOfItem[i] = 0;
      }
      if (quantityOfItem[i] <= 0) {
        itemNames[i] = null;
        System.out.println(itemName + "removed from the catalog with quantity.");
      } else {
        System.out.println(quantity + " " + itemName + " removed from the catalog. Quantity leftover: " + quantityOfItem[i]);
      }
      return();
    }
  }
}
    
  
public static void showCatalog() {
  System.out.println("Contents of Catalog");
   for(int i = 0; i < itemNames.length; i++) {
     if (itemNames[i] != null) {
       System.out.println(itemNames[i] + "stock: " + quantityOfItem[i]);
       }
     }
  }

}