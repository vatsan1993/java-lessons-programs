package Chap5.Ex7;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {
        Date d= new Date();
        System.out.println(d);

        GregorianCalendar calendar= new GregorianCalendar(1994,2, 12);
        System.out.println(calendar.toZonedDateTime());

        Date d2= new Date(143535345352143L);
        System.out.println(d2);

//        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
//        Date d3= df.parse("12.13.52");
//        System.out.println(d3);

        Book b= new Book("Lion King");
        b.addAuthor("James Brown");
        b.addAuthor("Jill James");
        b.addAuthor("James Hathoway");

        System.out.println(b);


        Email e= new Email();
        e.addAuthor("vatsan1993@gmail.com");
        e.addRecepient("max@example.com");
        e.addRecepient("max123@example.com");

        System.out.println(e);

    }
}
