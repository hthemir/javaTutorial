import java.util.Calendar;
public class Capitulo5Ex6 {
	
	public void ateAnoQueVem() {		
		Calendar dataAtual = Calendar.getInstance();
		Calendar data2018 = Calendar.getInstance();
		long dAtual;
		long d2018;
		
		data2018.set(Calendar.DAY_OF_MONTH,1);
		data2018.set(Calendar.MONTH,0);
		data2018.set(Calendar.YEAR,2018);
		data2018.set(Calendar.HOUR_OF_DAY,0);
		data2018.set(Calendar.MINUTE,0);
		data2018.set(Calendar.SECOND,0);		
		
		dAtual = dataAtual.getTimeInMillis();
		d2018 = data2018.getTimeInMillis();

		long segundos = (d2018-dAtual)/1000;
		long minutos = segundos/60;
		segundos = segundos%60;
		long horas = minutos/60;
		minutos = minutos%60;
		long dias = horas/24;
		horas = horas%24;
		long meses = dias/30;
		dias = dias%30;
		long anos = meses/12;
		meses = meses%12;
		System.out.println(anos+" anos "+meses+" meses "+dias+" dias "+horas +":"+minutos+":"+segundos);
	}

	public void maiorData(Calendar date1, Calendar date2) {
		long diferenca = 0;
		if (date1.before(date2)) {
			System.out.println("Dia do mes: " + date2.get(Calendar.DAY_OF_MONTH) +
								"\nMes : " + (date2.get(Calendar.MONTH) + 1) +
								"\nAno : " + date2.get(Calendar.YEAR) +
								"\nHora : " + date2.get(Calendar.HOUR_OF_DAY) +
								"\nMinuto : " + date2.get(Calendar.MINUTE) +
								"\nSegundo : " + date2.get(Calendar.SECOND));
			diferenca = (date2.getTimeInMillis()-date1.getTimeInMillis())/(1000*60*60*24);
		} else if (date1.after(date2)) {
			System.out.println("Dia do mes: " + date1.get(Calendar.DAY_OF_MONTH) +
								"\nMes : " + (date1.get(Calendar.MONTH) + 1) +
								"\nAno : " + date1.get(Calendar.YEAR) +
								"\nHora : " + date1.get(Calendar.HOUR_OF_DAY) +
								"\nMinuto : " + date1.get(Calendar.MINUTE) +
								"\nSegundo : " + date1.get(Calendar.SECOND));
			diferenca = (date1.getTimeInMillis()-date2.getTimeInMillis())/(1000*60*60*24);
		} else {
			System.out.println("Datas iguais");
		}
		if (diferenca > 20)
			System.out.println("A diferenca entre as datas eh maior que 20 dias");

	}
}


















