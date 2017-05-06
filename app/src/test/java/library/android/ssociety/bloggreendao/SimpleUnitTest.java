package library.android.ssociety.bloggreendao;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import library.android.ssociety.bloggreendao.Entities.DaoMaster;
import library.android.ssociety.bloggreendao.Entities.DaoSession;
import org.greenrobot.greendao.database.Database;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import static org.junit.Assert.assertEquals;


/**
 * Created by seb on 6/05/17.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SimpleUnitTest {


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void simpleAddition() throws Exception {
        assertEquals(4+5, 8);
    }
}
