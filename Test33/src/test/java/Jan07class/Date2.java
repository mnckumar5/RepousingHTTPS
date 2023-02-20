package Jan07class;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
    String date=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy").format(new Date());
    
    SimpleDateFormat da=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy");
    String date1=da.format(null);
    
    Date d=new Date();
		
		System.out.println(date);
		
	}

}
