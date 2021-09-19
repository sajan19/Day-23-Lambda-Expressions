import java.util.regex.Matcher;
import java.util.regex.Pattern;
//User Validation Using Lambda Functions
@FunctionalInterface
interface UserValidation{
    void validateUser();
    //Method to check whether the User Input entered follows the rules
    default void uservalid(String fname,String lname,String email, String mobileNum, String password){
        //Pattern to Validate First Name
        String fnmRegex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(fnmRegex);
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,17}$";
        Pattern e = Pattern.compile(emailRegex);
        String mobileRegex = "(0|91)?[\\s][7-9][0-9]{9}";
        Pattern mn = Pattern.compile(mobileRegex);
        String passwordRegex = "^(?=.*[0-9])"
                                + "(?=.*[a-z])(?=.*[A-Z])"
                                + "(?=.*[@#$%^&+=])"
                                + "(?=\\S+$).{8,20}$";
        Pattern pw = Pattern.compile(passwordRegex);
        Matcher f = p.matcher(fname);
        Matcher l = p.matcher(lname);
        Matcher em = e.matcher(email);
        Matcher mno = mn.matcher(mobileNum);
        Matcher ps = pw.matcher(password);
        System.out.println(fname + " : " + f.matches());
        System.out.println(lname + " : " + l.matches());
        System.out.println(email + " : " + em.matches());
        System.out.println(mobileNum + " : " + mno.matches());
        System.out.println(password + " : " + ps.matches());
    }
}
public class UserValidationUsingLambda {
    //Driver Main Class
    public static void main(String[] args) {
        //Validate User Input using Lambda Function
        System.out.println("Validate User Input...");
        //Lambda Expression
        UserValidation user = () -> {
//            System.out.println("First Name is: " +fname);
        };
        //Calling Lambda Expression to validate User Entry
        user.uservalid("Sajan", "Mhatre","sajan29@gmail.com",
                "91 9988776655", "Raaz@8765");
    }
}
