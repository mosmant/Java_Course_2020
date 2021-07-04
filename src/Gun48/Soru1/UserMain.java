package Gun48.Soru1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
        ArrayList<User> users=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        int sayac=1;
        boolean usernameIste=true;
        String username ="";
        do{
            if (usernameIste) {
                System.out.print(sayac + ".Username=");
                username = oku.nextLine();
            }

            System.out.print(sayac+".Password=");
            String password=oku.nextLine();

            try {
                User user = new User(username, password);
                users.add(user);
                sayac++;
                usernameIste=true;
            }
            catch (Exception ex)
            {
                usernameIste=false;
                System.out.println(ex.getMessage());
            }

        }while (users.size() < 2);


        for(User u: users)
        {
            System.out.println("u = " + u);
        }
            
    }
    
   
        
    
    
}
