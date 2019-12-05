package MobileLogin;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;


/**
 * Created by Angelo on 12/2/2019.
 *  POM for MobileLogin page
 */
public class MobileLogin
{
    private MobileDriver driver;

    public MobileLogin(MobileDriver driver) throws MalformedURLException
    {
        this.driver = driver;
    }

    public void userLogin(String email, String password)
    {
        //android.widget.EditText
        this.driver.findElementById("emailid").sendKeys(email);
        //android.widget.EditText
        this.driver.findElementById("passwordid").sendKeys(password);
        //android.widget.Button
        this.driver.findElementById("loginbuttonid").click();
    }

    /*
    *   TODO
    *   Look into why Toast pop up isn't rendering.
    *   Toast Message: Incorrect Email or Password.
    * */
    public MobileElement getErrorMessage()
    {
        //android.widget.Toast
        return (MobileElement) this.driver.findElementByClassName("android.widget.Toast");
    }

    /*
        TODO
        public void userSignUp() id: signupid Android Class TextView
        public void userForgotPassword() id: forgotpasswordid Android Class TextView
    */
}
