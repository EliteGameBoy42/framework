package first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datefunc {
	public static void main(String[] args) {

		
		Date dt=new Date();
		System.out.println(dt.getTime());
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(dt));
		
		
		
		
	}
}
