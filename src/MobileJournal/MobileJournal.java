package MobileJournal;

import io.appium.java_client.MobileDriver;
import java.net.MalformedURLException;

/**
 * Created by Angelo on 12/5/2019.
 *  xPath: /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView

 *
 */
public class MobileJournal
{
    private MobileDriver driver;

    public MobileJournal(MobileDriver driver) throws MalformedURLException
    {
        this.driver = driver;
    }

    public String getJournalTitle()
    {
        final String text = driver.findElementByClassName("android.widget.TextView").getText();

        return text;
    }
}