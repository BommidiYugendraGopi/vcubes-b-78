package methods;
import java.util.Scanner;
public class infogather {
	private String first_name ;
	private String last_name;
	public char gender;
	infogather(String f,String l){
		this.first_name=f;
		this.last_name=l;
	}
	
	 static String FName(infogather i) { return i.first_name; }
	  String Lname() { return last_name;}
	 
	 public static void main(String a[]) {
		 Scanner sc =new Scanner(System.in);
		 infogather i =new infogather("siva","mani");
		    System.out.println("First Name	: " +FName(i));
		    System.out.println("Last Name	: " +i.Lname());
		    System.out.println(sc.delimiter());
		    
		    int im =01234;
		    System.out.println(im);
		    int i1 =0x1234;
		    System.out.println(i1);
	 }
}
