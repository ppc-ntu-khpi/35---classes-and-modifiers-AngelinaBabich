
public class  Customer {
  
   private int ID;
   private boolean isNew;
   private float total;

   public void displayCustomerInfo()
   {
     System.out.println("Номер клієнта: "+ID);
     if (isNew)
      System.out.println("Це новий клієнт");
     else
      System.out.println("Це існуючий клієнт");
     System.out.println("Сума продажів: "+total);
   }



public Customer() {
  ID=0;
  isNew=true;
  total=0;
}
public void setID (int ID) {
if (ID >0) this.ID=ID;
}
public void setStatus (boolean isNew) {
if (this.isNew && isNew!=true)
  this.isNew=isNew;
}
public void setTotal (float total) {
if (total >0) this.total=total;
}
}
