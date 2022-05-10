package modulodatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparandoDatas {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date dataVencimentoBoleto = simpleDateFormat.parse("15/05/2022");
			Date dataAtual = simpleDateFormat.parse("10/05/2022");
			
			if(dataVencimentoBoleto.after(dataAtual)) {
				System.out.println("Esse boleto ainda não venceu");
			}else {
				System.out.println("Boleto vencido - URGENTE");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
