package week11_enum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setGender(Gender.Female);
//        System.out.println(person);
//
//        Gender g = Gender.Male;
//        System.out.println(g);
//
//        for(Gender r : Gender.values()){
//            System.out.println(r);
//        }

        /////// enum 2
        Level level = Level.medium;
        System.out.println(level);

        System.out.println(level.code);
        System.out.println(level.keyword);
        System.out.println(level.aslowercase());


        /// DateTime
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        System.out.println(myDateTime);
        System.out.println(dateTimeFormatter.format(myDateTime));
    }
}
