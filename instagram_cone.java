import java.util.Scanner;

//login for already created account
class login extends checkPasswordAndUsr {

    public void login_user(checkPasswordAndUsr sc) {
        System.err.println("Login Successful");

    }

}

class checkPasswordAndUsr {
    Scanner pas = new Scanner(System.in);
    String username;
    String password;

    public void password() {
        System.out.println("Enter User Name: ");
        this.username = pas.nextLine();
        System.out.println("Enter Password: ");
        this.password = pas.nextLine();
        System.err.println("Login Successful");

    }

    public String getusername(String username) {
        return username;
    }

    public String getpasswrod(String Password) {

        return password;
    }

}

// Account class
class account {
    // Scanner class object
    Scanner ac = new Scanner(System.in);
    login lo = new login();
    // Non static variable
    String name;
    long mobileNo;
    String email;
    String city;
    int age;
    String country;

    // accept details method from user
    public void acceptDetails() {

        System.out.println("Enter Your name: ");
        name = ac.next();
        System.out.println("Enter Mobile number: ");
        mobileNo = ac.nextLong();
        mobile(mobileNo);
        System.out.println("Enter Your Email: ");
        email = ac.next();
        System.out.println("Enter Your age");
        age = ac.nextInt();
        checkage(age);
        System.out.println("Enter Your Country: ");
        country = ac.next();
        checkCountry(country);

    }

    // Check mobile no
    public int mobile(long mobileNo) {
        long duplicate = mobileNo;
        int count = 0;
        while (duplicate != 0) {
            count++;
            duplicate /= 10;
        }

        if (count == 10) {
            System.err.println("Valid Mobile Number");
        } else {
            System.err.println("Invalid Mobile Number ");
        }

        return 1;
    }

    // Checing age
    public void checkage(int age) {

        if (age < 18) {
            System.err.println("Your Under age ");
        } else {
            System.err.println("Welcome your eligible For instagram");
        }
    }

    // check country
    public void checkCountry(String country) {

        if (country.equals("INDIA") || country.equals("india") || country.equals("India")) {
            System.out.println("Welcome Indian");
        } else {
            System.err.println("This is only for  Indians");
        }
    }

    public void accountCreted() {

        System.err.println("Your account is Successfully Created ");
        System.out.println("Now You can login");
        lo.password();
    }

}

// Mainn method
public class instagram_cone {
    public static void main(String[] args) {
        // Objects
        Scanner sc = new Scanner(System.in);
        login o1 = new login();
        account ac = new account();

        System.out.println("Enter Your choice: ");
        System.out.println("1 Login");
        System.out.println("2 Create Account");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                o1.password();
                o1.login_user(o1);
                break;
            case 2:
                ac.acceptDetails();
                ac.accountCreted();
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
