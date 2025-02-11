package localdatetest.in;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now();
		System.out.println(localDate2);
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		LocalDate localDate3 = LocalDate.now(zoneId);
		System.out.println(localDate3);
		
		System.out.println("-----------------");
		
		LocalDate localDate4 = LocalDate.of(2024, 04, 06);
		System.out.println(localDate4);
		
		System.out.println("-----------------");

		
		LocalDate localDate5 = LocalDate.parse("2024-04-08");
		System.out.println(localDate5);
		
		System.out.println("-----------------");
		LocalDate localDate6 = localDate5.plusDays(2);
		System.out.println(localDate6);
		
		System.out.println("-----------------");
		LocalDate localDate7 = localDate5.minus(2, ChronoUnit.DAYS);
		System.out.println(localDate7);
		
		
	}

}
