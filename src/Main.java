import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println( "Today is: "  +  now);

        System.out.println();
        LocalDate myBirthday = LocalDate.of(1986,6,2);
        System.out.println( "My Birthday is: " +  myBirthday);

        System.out.println();
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2023,1,29);
       int checkDate = date1.compareTo(date2);
       if (checkDate == 0){
           System.out.println("The dates are same");
       }else if (checkDate < 0){
           System.out.println("date1 is less than date2");
       }else {
           System.out.println("date1 is more than date2");

           System.out.println();
           LocalTime nowTime = LocalTime.now();
           System.out.println("Now is " + nowTime);

           System.out.println();
           LocalTime nowTimeTreeHours = nowTime.plusHours(3);
           System.out.println( "+ 3 hours " +  nowTimeTreeHours);

           System.out.println();
           LocalDate dateAfterWeek = now.plusWeeks(1);
           System.out.println("Date after week " + dateAfterWeek);

           System.out.println();
           LocalDate today = LocalDate.now();
           LocalDate tomorrow = today.plusDays(1);
           LocalDate yesterday = today.minusDays(1);

           if (tomorrow.isAfter(today)){
               System.out.println("Tomorrow is after today ");

           } else if (tomorrow.isBefore(today)) {
               System.out.println("Tomorrow is before today ");

           }else{
               System.out.println("Tomorrow is today ");

               if (yesterday.isBefore(today)){
                   System.out.println("Yesterday is before today ");

               } else if (yesterday.isAfter(today)) {
                   System.out.println("Yesterday is after today ");

               }else {
                   System.out.println("Yesterday is today ");
               }
           }
       }



        }
    }
