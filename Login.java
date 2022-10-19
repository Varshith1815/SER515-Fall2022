import javax.swing.*;
import java.util.Scanner;

public class Login {

    private Facade createuser;

        public boolean validate(int userType, String username, String password) {
            UserInfoItem user1= new UserInfoItem();
            user1.setUserName(username);
            user1.setUserType(userType);
            user1.setPassword(password);
            if (userType== 0) {
                System.out.println("Welcome Buyer ");
                if ((username.equalsIgnoreCase("tutu")) && (password.equalsIgnoreCase("1111"))) {
                    System.out.println("Welcome tutu ");
                } else if ((username.equalsIgnoreCase("mimi")) && (password.equalsIgnoreCase("2222"))) {
                    System.out.println("Welcome meme ");
                } else if ((username.equalsIgnoreCase("nana")) && (password.equalsIgnoreCase("3333"))) {
                    System.out.println("Welcome nana ");
                } else {
                     createuser.createUser(user1);
                }
            } else if(userType==1){
                System.out.println("Welcome Seller ");
                if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("3333"))) {
                   System.out.println("Welcome pepe ");
                }
                else {
                    createuser.createUser(user1);
                }
            }else {
                System.out.println("Invalid User Type");
                return false;
            }
            return true;

        }

    public int user() {

        System.out.println("Enter UserType : \n 0 for Buyer \n 1 for seller");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int userType = Integer.parseInt(scan.next());
        System.out.println("Enter UserName : ");
        String userName = scan.next();
        System.out.println("Enter Passcode : ");
        String password = scan.next();
        boolean success = validate(userType,userName, password);
        if(success==true)
            return userType;
        else{
            System.exit(-1);
        }
        return userType;
    }

}
