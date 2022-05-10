package modulodatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
//		System.out.println(date.getTime());
//		System.out.println(date.getDay());
//		System.out.println(date.getHours());
//		System.out.println(date.getMinutes());
//		System.out.println(date.getMonth());
//		System.out.println(date.getYear());
//		
		/*-------- Simple Date Format ---------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data de hoje: " + simpleDateFormat.format(date));
		
		SimpleDateFormat simpleDateFormatBancoDeDados = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormatBancoDeDados.format(date));
		
		SimpleDateFormat simpleDateFormatHours = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println(simpleDateFormatHours.format(date));
		
		System.out.println(simpleDateFormatHours.parse("1994-09-05 08:07.55"));
		
		/*-------- Calendar ---------*/
		
		System.out.println("----------------------------");
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("date em millesegundos "+ calendar.getTimeInMillis());
		System.out.println("dia do mês "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("dia da semana "+(calendar.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("Mês: "+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto da hora: " + calendar.get(Calendar.MINUTE));
	}
}
