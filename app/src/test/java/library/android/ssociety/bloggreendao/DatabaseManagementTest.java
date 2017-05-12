package library.android.ssociety.bloggreendao;

import library.android.ssociety.bloggreendao.Entities.DaoMaster;
import library.android.ssociety.bloggreendao.Entities.DaoSession;
import library.android.ssociety.bloggreendao.Entities.Livre;
import library.android.ssociety.bloggreendao.Entities.LivreDao;
import org.greenrobot.greendao.database.Database;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.List;

/**
 * Created by seb on 11/05/17.
 */


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class,
        application=ApplicationForRobolectric.class)
public class DatabaseManagementTest {

    DaoSession daoSession;
    @Before
    public void setUp() throws Exception {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(RuntimeEnvironment.application, "test-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();

    }

    @Test
    public void InsertLivre() throws Exception {

        LivreDao livreDao = daoSession.getLivreDao();
        List<Livre> livres = livreDao.loadAll();
        Assert.assertEquals(livres.size(), 0);
        Livre livre  = new Livre(null, "titre1", "auteur1", 2017);
        livreDao.insert(livre);
        livres = livreDao.loadAll();
        Assert.assertEquals(livres.size(), 1);
        Assert.assertEquals(livreDao.loadAll().get(0).getTitre(),"titre1");
    }
}
