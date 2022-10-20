import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.io.File.separator;

public class Login {

    private Facade createuser;

        public boolean validate(int userType, String username, String password) {
            UserInfoItem newuser= new UserInfoItem();
            newuser.setUserName(username);
            newuser.setUserType(userType);
            newuser.setPassword(password);
            String filePath = null;
            if(userType==0)
            {
                filePath= "BuyerInfo.txt";
                System.out.println("Hey Buyer: \n");
            }
            else if(userType==1)
            {
                filePath= "SellerInfo.txt";
                System.out.println("Hey Seller: \n");
            }
            else{ 
                System.out.println("Enter a valid User Type");
                System.exit(-1);
            }
            Map<String, String> loginCode = new HashMap<>();
            try {
                File file = new File(filePath);
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if(line.contains(":")) {
                        String[] authValues = line.split(":");
                        loginCode.put(authValues[0], authValues[1]);
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            if(loginCode.get(username).equalsIgnoreCase(password))
            {
                System.out.println("Welcome "+ username +":");
                return true;
            }
            else {
                System.out.println("Invalid User Type");
                return false;
            }
        }

    public int user() {

        System.out.println("Enter UserType : \n 0 for Buyer \n 1 for seller");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int userType = Integer.parseInt(sc.next());
        System.out.println("Enter UserName : ");
        String userName = sc.next();
        System.out.println("Enter Passcode : ");
        String password = sc.next();
        boolean success = validate(userType,userName, password);
        if(success==true)
            return userType;
        else{
            System.exit(-1);
        }
        return userType;
    }

}
