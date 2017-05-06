package library.android.ssociety.bloggreendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import library.android.ssociety.bloggreendao.Entities.DaoSession;
import library.android.ssociety.bloggreendao.Entities.Livre;
import library.android.ssociety.bloggreendao.Entities.LivreDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LivreDao livreDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaoSession daoSession = ((App) getApplication()).getDaoSession();
        livreDao = daoSession.getLivreDao();
        Livre livre  = new Livre(null, "titre1", "auteur1", 2017);
        livreDao.insert(livre);
        List<Livre> livres = livreDao.loadAll();
        System.out.println();



    }
}
