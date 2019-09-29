import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

class Project {
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
    Check_Age check_age_total = new Check_Age();

    while (true) {
        get_year_now.input_year();
        get_year_birth.year_now_get();
        int year_now = Integer.parseInt(get_year_birth.formattedDate);
        int age = year_now - get_year_now.year;
        System.out.print("Age Now : ");
        System.out.println(age);
        check_age_total.check_age(age);
    }
  }
}

class Check_Age {
  public static void check_age(int x){
    if(x <= 12){
      System.out.println("วัยเด็ก");
    }
    else if(x <= 25){
      System.out.println("วัยรุ่น");
    }
    else if(x <= 40){
      System.out.println("วัยกลางคน");
    }
    else if(x <= 60){
      System.out.println("วัยทอง");
    }
    else if(x > 60){
      System.out.println("ผู้สูงอายุ");
    }
  }
}
