package modulodatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculoDeDatas {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // o getInstance pega a data atual
		
		try {
			calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2022-05-10")); // definindo uma data para o calendar
			
//			// somando dias
//			calendar.add(Calendar.DAY_OF_MONTH, 10);
//			
//			// somando dias da semana no mês
//			calendar.add(Calendar.DAY_OF_WEEK_IN_MONTH, 10);
//			
//			// somando 12 mêses
//			calendar.add(Calendar.MONTH, 12);
			
			calendar.add(Calendar.MONTH, 12);
			
			System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
