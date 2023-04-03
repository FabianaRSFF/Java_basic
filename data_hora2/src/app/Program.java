package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate d04 = LocalDate.parse("2023-04-01");
		LocalDateTime d05 = LocalDateTime.parse("2023-04-01t01:37");
		Instant d06 = Instant.parse("2023-04-01t01:39:05Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.minusDays(7);
		
		
		System.out.println("pastWeekLocalDateTime= " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime= " + nextWeekLocalDateTime);
		System.out.println("pastWeekLocalDate= " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate= " + nextWeekLocalDate);
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		System.out.println("r1= " + r1);
		System.out.println("r2= " + r2);
		System.out.println("r3= " + r3);
		System.out.println("r4= " + r4);
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d04= " + d04.format(fmt1));
		System.out.println("d04= " + fmt1.format(d04));
		System.out.println("d05= " + d05.format(fmt2));
		System.out.println("d06= " + fmt3.format(d06));
		
	}

}
