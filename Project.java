import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Project {
  int year;
  String formattedDate;

  public void year_now_get() {
    LocalDateTime myDateObj = LocalDateTime.now();   
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy");  
    formattedDate = myDateObj.format(myFormatObj); 
  }

  public void input_year() {
    Scanner year_input = new Scanner(System.in);
    System.out.println("Enter Year of Birth");
    year = year_input.nextInt();
  }

  
  public static void main(String[] args) {
    Project get_year_now = new Project();
    Project get_year_birth = new Project();
    while (true) {
        get_year_now.input_year();
        get_year_birth.year_now_get();
        // System.out.println(myObj.year);
        int year_now = Integer.parseInt(get_year_birth.formattedDate);
        // System.out.println(myObj1.formattedDate);
        int age = year_now - get_year_now.year;
        System.out.print("Age Now : ");
        System.out.println(age);
    }
  }
}