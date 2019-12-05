package MobileJournalTest;

import MobileJournal.MobileJournal;
import Utilities.Fixtures;
import org.junit.Before;
import org.junit.Test;
import io.appium.java_client.MobileDriver;
import org.junit.Assert;
import java.net.MalformedURLException;

/**
 * Created by Angelo on 12/5/2019. 
 * Tests for the Mobile Login page
 * Implement test cases for the 7 clickable objects
 * getJournalTitlePage used to ensure we're on the correct page
 */
public class TestMobileJournal extends Fixtures
{
    MobileJournal mobileJournal;
    MobileDriver driver;

    @Before
    public void initialize() throws MalformedURLException
    {
        driver = initializeCapabilities();
        mobileJournal = new MobileJournal(driver);
    }

    @Test
    public void getJournalTitlePage()
    {
        String title = mobileJournal.getJournalTitle();
        Assert.assertTrue(title.contains("Journal"));
    }
}
