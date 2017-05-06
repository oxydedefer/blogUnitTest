package library.android.ssociety.bloggreendao;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import library.android.ssociety.bloggreendao.Entities.DaoMaster;
import library.android.ssociety.bloggreendao.Entities.DaoSession;
import org.greenrobot.greendao.database.Database;

/**
 * Created by seb on 30/04/17.
 */

public class App extends Application {

    private DaoSession daoSession;
    public static boolean ENCRYPTED = true;

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationInfo foo = getApplicationInfo();

        if (isRoboUnitTest())
        {
            ENCRYPTED = false;
        }


        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, ENCRYPTED ? "livre-db-encrypted" : "livre-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret-mdp") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static boolean isRoboUnitTest() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
