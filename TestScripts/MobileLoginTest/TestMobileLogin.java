package MobileLoginTest;

import MobileLogin.MobileLogin;
import MobileJournal.MobileJournal;
import Utilities.Fixtures;
import org.junit.Before;
import org.junit.Test;
import io.appium.java_client.MobileDriver;
import org.junit.Assert;
import java.net.MalformedURLException;

/**
 * Created by Angelo on 12/2/2019.
 * Tests for the Mobile Login page
 */
public class TestMobileLogin extends Fixtures
{
    MobileLogin mobileLogin;
    MobileJournal mobileJournal;
    MobileDriver driver;

    @Before
    public void initialize() throws MalformedURLException
    {
        driver = initializeCapabilities();
        mobileLogin = new MobileLogin(driver);
        //This object is used to determine if the user logged in correctly.
        mobileJournal = new MobileJournal(driver);
    }

    @Test
    public void validLogin() throws InterruptedException
    {
        mobileLogin.userLogin("ffghy@yghy.com", "testpassword");
        Thread.sleep(3000);
        String title = mobileJournal.getJournalTitle();
        Assert.assertTrue(title.contains("Journal"));
    }

    @Test
    public void invalidLogin()
    {
        mobileLogin.userLogin("foo", "bar");
        //errorMessage = mobileLogin.getErrorMessage();
        //Assert.assertEquals(errorMessage.getText(),"Incorrect Email or Password.");
    }

    @Test
    public void missingLoginEmail()
    {
        mobileLogin.userLogin("", "bar");
        //errorMessage = mobileLogin.getErrorMessage();
        //Assert.assertEquals(errorMessage.getText(),"Incorrect Email or Password.");
    }

    @Test
    public void missingLoginPassword()
    {
        mobileLogin.userLogin("foo", "");
        //errorMessage = mobileLogin.getErrorMessage();
        //Assert.assertEquals(errorMessage.getText(),"Incorrect Email or Password.");
    }

    @Test
    public void clickSignUpLink()
    {
        //TODO
    }

    @Test
    public void clickForgotPasswordLink()
    {
        //TODO
    }
}
