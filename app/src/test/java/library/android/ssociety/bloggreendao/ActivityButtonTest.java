package library.android.ssociety.bloggreendao;

import android.widget.Button;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;

import static org.hamcrest.Matchers.equalTo;


/**
 * Created by seb on 11/05/17.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class ActivityButtonTest {

    @Test
    public void clickingButton_shouldshowToast() throws Exception {
    ButtonActivity activity = Robolectric.setupActivity(ButtonActivity.class);

    Button button = (Button) activity.findViewById(R.id.button);

    button.performClick();
    Assert.assertThat( ShadowToast.getTextOfLatestToast(), equalTo("success"));


  }


}
