package modulodatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GerandoParcelas {
	public static void main(String[] args) throws ParseException {
		Date dataIniciar = new SimpleDateFormat("dd/MM/yyyy").parse("10/05/2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataIniciar);
		
		for(int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			System.out.println("Parcela nº "+parcela+" vencimento é em: "+new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}
}
