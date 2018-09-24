
public class Medicine {
 private String medicineName;
 private int medicinePrice;
 public Medicine() 
 { 
   medicineName="ABC";
   medicinePrice=100;
 }
 public Medicine(int a,String s) 
 { 
   medicineName=s;
   medicinePrice=a;
 }
 public String getMedicineName()
 {
	 return medicineName;
 }
 public int getMedicinePrice()
 {
	 return medicinePrice;
 }
 public void setPrice(int a)
 {
	 medicinePrice=a;
 }
 public void setName(String a)
 {
	 medicineName=a;
 }
 public void displayMedicine() 
 {
	 System.out.println("price: "+getMedicinePrice()+" name: "+getMedicineName());
 }
	public static void main(String[] args) {
		Medicine a=new Medicine();
		Medicine b=new Medicine(23,"Flexon");
		a.setName("Gek");
		a.setPrice(100);
		a.displayMedicine();
		b.displayMedicine();

	}
}
