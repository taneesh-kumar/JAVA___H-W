import java.util.*;

public class UserNameEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email ID");
        String email = sc.next();

        String username = "";

        for(int i=0; i<email.length(); i++){
            if (email.charAt(i) == '@') {
                break;
            }
            else {
                username += email.charAt(i);
            }
        }

        System.out.println("Your User name is : "+username);
    }    
}