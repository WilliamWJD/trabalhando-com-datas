package modulodatas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FaixaDeTempo {
	public static void main(String[] args) throws ParseException {
		// descobrindo quantos dias o boleto est� atrasado
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-04-05"), LocalDate.now());
		System.out.println("O boleto est� atrasado a " + dias + " dias");
	}
}	
