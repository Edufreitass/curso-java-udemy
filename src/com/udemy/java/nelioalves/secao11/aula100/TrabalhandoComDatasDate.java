package com.udemy.java.nelioalves.secao11.aula100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TrabalhandoComDatasDate {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);

		Date y1 = sdf1.parse("25/12/2020");
		Date y2 = sdf2.parse("01/01/2020 11:42:08");
		// Padrão ISO 8601
		Date y3 = Date.from(Instant.parse("2020-08-11T12:00:00Z"));

		System.out.println("x1: " + x1); // x1: Tue Aug 11 12:00:39 BRT 2020
		System.out.println("x2: " + x2); // x2: Tue Aug 11 12:00:39 BRT 2020
		System.out.println("x3: " + x3); // x3: Wed Dec 31 21:00:00 BRT 1969
		System.out.println("x4: " + x4); // x4: Thu Jan 01 02:00:00 BRT 1970

		System.out.println();

		System.out.println("y1: " + y1); // y1: Fri Dec 25 00:00:00 BRT 2020
		System.out.println("y2: " + y2); // y2: Wed Jan 01 11:42:08 BRT 2020
		System.out.println("y3: " + y3); // y3: Tue Aug 11 09:00:00 BRT 2020

		System.out.println("----------------------");
		System.out.println("x1: " + sdf2.format(x1)); // x1: 11/08/2020 11:56:29
		System.out.println("x2: " + sdf2.format(x2)); // x2: 11/08/2020 11:56:29
		System.out.println("x3: " + sdf2.format(x3)); // x3: 31/12/1969 21:00:00
		System.out.println("x4: " + sdf2.format(x4)); // x4: 01/01/1970 02:00:00

		System.out.println();

		System.out.println("y1: " + sdf2.format(y1)); // y1: 25/12/2020 00:00:00
		System.out.println("y2: " + sdf2.format(y2)); // y2: 01/01/2020 11:42:08
		System.out.println("y3: " + sdf2.format(y3)); // y3: 11/08/2020 09:00:00

		System.out.println("----------------------");
		System.out.println("x1: " + sdf3.format(x1)); // x1: 11/08/2020 14:56:29
		System.out.println("x2: " + sdf3.format(x2)); // x2: 11/08/2020 14:56:29
		System.out.println("x3: " + sdf3.format(x3)); // x3: 01/01/1970 00:00:00
		System.out.println("x4: " + sdf3.format(x4)); // x4: 01/01/1970 05:00:00

		System.out.println();

		System.out.println("y1: " + sdf3.format(y1)); // y1: 25/12/2020 03:00:00
		System.out.println("y2: " + sdf3.format(y2)); // y2: 01/01/2020 14:42:08
		System.out.println("y3: " + sdf3.format(y3)); // y3: 11/08/2020 12:00:00
	}

}
